/**
 * 
 * 
 * 创建时间：2019年11月18日 下午1:40:24
 * @author：moshco zhu
 */
package top.moshco.mysuit.commons.dao;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import top.moshco.mhsdk.Pagination;

/**
 * MogoDB基础业务类
 * 
 * 
 * 创建时间：2019年11月18日 下午2:46:54
 * @author moshco zhu
 *
 */
@Repository
public class MogoDBBaseDao implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(MogoDBBaseDao.class);

	// MongoDB的模版操作对象
	@Autowired
	private MongoTemplate mongoTemplate = null;

	/**
	 * 找寻指定主键值的对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:24:03
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param entityClass
	 * @param primaryKeyValue
	 * @return
	 */
	public <T> T find(Class<T> entityClass, String primaryKeyValue) {

		Query query = new Query();
		Criteria criteria = Criteria.where(getPrimaryKeyName(entityClass)).is(primaryKeyValue);
		query.addCriteria(criteria);

		T entityBean = mongoTemplate.findOne(query, entityClass);

		return entityBean;

	}

	/**
	 * 查询符合条件记录
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:33:16
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param entityClass
	 * @param queryParamMap
	 * @return
	 */
	public <T> List<T> query(Class<T> entityClass, Map<String, Object> queryParamMap) {

		Query query = buildQuery(entityClass, queryParamMap);

		List<Map<String, String>> orderParams = (List<Map<String, String>>) queryParamMap.get("orderParams");
		Sort sort = buildSort(entityClass, orderParams);
		if (sort != null) {
			query.with(sort);
		}

		List<T> entityBeanList = mongoTemplate.find(query, entityClass);

		return entityBeanList;

	}

	/**
	 * 分页查询
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午4:41:31
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param entityClass
	 * @param pagination
	 * @return
	 */
	public <T> Pagination<T> queryPagination(Class<T> entityClass, Pagination<T> pagination) {

		Map<String, Object> queryParamMap = pagination.getQueryParamMap();

		Query query = buildQuery(entityClass, queryParamMap);

		Long totalRecord = mongoTemplate.count(query, entityClass);
		pagination.setTotalRecord(totalRecord.intValue());

		List<Map<String, String>> orderParams = (List<Map<String, String>>) queryParamMap.get("orderParams");
		Sort sort = buildSort(entityClass, orderParams);
		Pageable pageable = PageRequest.of(pagination.getPageIndex() - 1, pagination.getPageSize(), sort);
		query.with(pageable);

		List<T> currentPageList = mongoTemplate.find(query, entityClass);
		pagination.setCurrentPageList(currentPageList);

		return pagination;

	}

	/**
	 * 构建排序对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午6:06:41
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param entityClass
	 * @param orderParams
	 * @return
	 */
	private static <T> Sort buildSort(Class<T> entityClass, List<Map<String, String>> orderParams) {

		if (orderParams == null || orderParams.size() <= 0) {
			return null;
		}

		Sort sort = null;
		for (Map<String, String> orderParam : orderParams) {
			
			String fieldName = orderParam.get("name");
			String direction = orderParam.get("direction");

			try {
				entityClass.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
				continue;
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("", e);
			}

			Order order = null;
			if ("asc".equalsIgnoreCase(direction)) {
				order = new Sort.Order(Direction.ASC, fieldName);
			} else if ("desc".equalsIgnoreCase(direction)) {
				order = new Sort.Order(Direction.DESC, fieldName);
			}

			if (sort == null) {
				sort = Sort.by(order);
			} else {
				sort.and(Sort.by(order));
			}

		}

		return sort;
		
	}

	/**
	 * 构建Query的对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午4:52:12
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @return
	 */
	private static <T> Query buildQuery(Class<T> entityClass, Map<String, Object> queryParamMap) {

		Query query = new Query();

		if (queryParamMap == null || queryParamMap.size() <= 0) {
			return query;
		}

		Set<String> paramNameSet = queryParamMap.keySet();
		for (String paramName : paramNameSet) {

			try {
				entityClass.getDeclaredField(paramName);
			} catch (NoSuchFieldException e) {
				continue;
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("", e);
			}

			Object paramValue = queryParamMap.get(paramName);

			if (paramValue == null) {
				Criteria criteria = new Criteria(paramName);
				criteria.is(null);
				query.addCriteria(criteria);
				continue;
			}

			if (String.class.isAssignableFrom(paramValue.getClass())) {
				Criteria criteria = new Criteria(paramName);
				String paramValue1 = (String) paramValue;
				if (paramValue1.startsWith("(") && paramValue1.endsWith(")")) {
					criteria.regex(paramValue1);
				} else {
					criteria.is(paramValue1);
				}
				query.addCriteria(criteria);
				continue;
			}

			if (paramValue.getClass().isArray()) {
				Criteria criteria = new Criteria(paramName);
				Object[] ary = (Object[]) paramValue;
				if (ary.length == 1) {
					criteria.gte(ary[0]);
				} else if (ary.length == 2) {
					criteria.gte(ary[0]);
					criteria.lte(ary[1]);
				} else {
					List list = new ArrayList();
					for (Object obj : ary) {
						list.add(obj);
					}
					criteria.in(list);
				}
				query.addCriteria(criteria);
				continue;
			}

			if (Collection.class.isAssignableFrom(paramValue.getClass())) {
				Criteria criteria = new Criteria(paramName);
				Collection col = (Collection) paramValue;
				criteria.in(col);
				query.addCriteria(criteria);
				continue;
			}

		}

		return query;

	}

	/**
	 * 保存实体对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午1:42:14
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 */
	public <T> void save(T bean) {
		setFieldValue(bean, "isValid", 1);
		mongoTemplate.save(bean);
	}

	/**
	 * 更新实体对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午1:43:33
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 */
	public <T> void update(T bean) {

		Query query = new Query();
		Criteria criteria = Criteria.where(getPrimaryKeyName(bean)).is(getPrimaryKeyValue(bean));
		query.addCriteria(criteria);

		Update update = new Update();
		setAllFieldsValue(update, bean);

		mongoTemplate.updateFirst(query, update, bean.getClass());

	}

	/**
	 * 删除实体对象
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:18:27
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 */
	public <T> void delete(T bean) {

		Query query = new Query();
		Criteria criteria = Criteria.where(getPrimaryKeyName(bean)).is(getPrimaryKeyValue(bean));
		query.addCriteria(criteria);

		setFieldValue(bean, "isValid", 0);

		Update update = new Update();
		setAllFieldsValue(update, bean);

		mongoTemplate.updateFirst(query, update, bean.getClass());

	}

	/**
	 * 设置指定名称字段的值
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:09:01
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 * @param fieldName
	 * @param value
	 */
	public static <T> void setFieldValue(T bean, String fieldName, Object value) {

		try {
			Class<?> entityClass = bean.getClass();
			Field field = entityClass.getDeclaredField(fieldName);
			boolean b = false;
			if (!field.isAccessible()) {
				b = true;
				field.setAccessible(true);
			}
			field.set(bean, value);
			if (b) {
				field.setAccessible(false);
			}

		} catch (Exception e) {
			throw new RuntimeException("设置字段（class:" + bean.getClass() + " field:" + fieldName + "）的值出错。", e);
		}

	}

	/**
	 * 设置所有字段的值
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:00:15
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param update
	 * @param bean
	 */
	public static <T> void setAllFieldsValue(Update update, T bean) {

		Class<?> entityClass = bean.getClass();
		Field[] fields = entityClass.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (Field field : fields) {
				try {
					org.springframework.data.mongodb.core.mapping.Field ann = field
							.getAnnotation(org.springframework.data.mongodb.core.mapping.Field.class);
					if (ann != null) {
						boolean b = false;
						if (!field.isAccessible()) {
							b = true;
							field.setAccessible(true);
						}
						Object value = field.get(bean);
						if (b) {
							field.setAccessible(false);
						}
						update.set(field.getName(), value);
					}
				} catch (Exception e) {
					logger.error("读取指定字段（class:" + bean.getClass() + " field:" + field + "）的值出错。", e);
				}
			}

		}

	}

	/**
	 * 读取主键名称
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午1:50:40
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 * @return
	 */
	public static <T> String getPrimaryKeyName(T bean) {

		Class<?> entityClass = bean.getClass();
		return getPrimaryKeyName(entityClass);

	}

	/**
	 * 读取主键名称
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午2:26:50
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param entityClass
	 * @return
	 */
	public static <T> String getPrimaryKeyName(Class<?> entityClass) {

		Field[] fields = entityClass.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (Field field : fields) {
				Id ann = field.getAnnotation(Id.class);
				if (ann != null) {
					return field.getName();
				}
			}

		}
		return null;

	}

	/**
	 * 读取主键的值
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午1:56:35
	 * 
	 * @author：moshco zhu
	 * @param <T>
	 * @param bean
	 * @return
	 */
	public static <T> Object getPrimaryKeyValue(T bean) {

		Class<?> entityClass = bean.getClass();
		Field[] fields = entityClass.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (Field field : fields) {
				try {
					Id ann = field.getAnnotation(Id.class);
					if (ann != null) {
						boolean b = false;
						if (!field.isAccessible()) {
							b = true;
							field.setAccessible(true);
						}
						Object value = field.get(bean);
						if (b) {
							field.setAccessible(false);
						}
						return value;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		return null;

	}

}
