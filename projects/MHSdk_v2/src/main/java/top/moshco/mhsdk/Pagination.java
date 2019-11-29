/**
 * 
 * 
 * 创建时间：2019年4月25日 下午5:57:49
 * @author：moshco zhu
 */
package top.moshco.mhsdk;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页封装
 * 
 * 创建时间：2019年4月25日 下午5:57:49
 * 
 * @author moshco zhu
 * 
 */
public class Pagination<T> implements Serializable {

	// 页面序号
	private Integer pageIndex = 1;

	// 页面尺寸
	private Integer pageSize = 2;

	// 当前页的列表
	private List<T> currentPageList = null;

	// 总记录数
	private Integer totalRecord = 0;

	// 总计页数
	private Integer totalPage = 0;

	// 排序参数列表
	private List<Map<String, Object>> orderParams = null;

	// 查询参数集合
	private Map<String, Object> queryParamMap = null;

	// 返回参数集合
	private Map<String, Object> returnParamMap = null;

	// url的参数
	private StringBuilder urlParamsBuilder = null;

	/**
	 * 升序排序参数
	 * 
	 * 
	 * 开发时间：2019年5月13日 下午6:22:47
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @param paramName
	 */
	public static void addOrderParamByAsc(Map<String, Object> queryParamMap, String paramName) {

		if (queryParamMap == null) {
			return;
		}

		List<Map<String, Object>> orderParams = (List<Map<String, Object>>) queryParamMap.get("orderParams");
		if (orderParams == null) {
			// 创建排序项目
			orderParams = new ArrayList<Map<String, Object>>();
			queryParamMap.put("orderParams", orderParams);
		}

		Map<String, Object> orderParam = new HashMap<String, Object>();
		orderParam.put("name", paramName);
		orderParam.put("direction", "asc");
		// 加入列表
		orderParams.add(orderParam);

	}

	/**
	 * 倒序排序参数
	 * 
	 * 
	 * 开发时间：2019年5月13日 下午6:19:06
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 * @param paramName
	 */
	public static void addOrderParamByDesc(Map<String, Object> queryParamMap, String paramName) {

		if (queryParamMap == null) {
			return;
		}

		List<Map<String, Object>> orderParams = null;
		orderParams = (List<Map<String, Object>>) queryParamMap.get("orderParams");
		if (orderParams == null) {
			// 创建排序项目
			orderParams = new ArrayList<Map<String, Object>>();
			queryParamMap.put("orderParams", orderParams);
		}

		Map<String, Object> orderParam = new HashMap<String, Object>();
		orderParam.put("name", paramName);
		orderParam.put("direction", "desc");
		// 加入列表
		orderParams.add(orderParam);

	}

	/**
	 * 添加倒序排列字段
	 * 
	 * 
	 * 开发时间：2019年5月13日 下午3:48:26
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 */
	public void addOrderDesc(String paramName) {

		// 封装排序参数
		if (orderParams == null) {
			orderParams = new ArrayList<Map<String, Object>>();
		}
		// 创建排序项目
		Map<String, Object> orderParam = new HashMap<String, Object>();
		orderParam.put("name", paramName);
		orderParam.put("direction", "desc");
		// 加入列表
		orderParams.add(orderParam);

	}

	/**
	 * 添加升序排列字段
	 * 
	 * 
	 * 开发时间：2019年5月13日 下午4:43:41
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 */
	public void addOrderAsc(String paramName) {

		// 封装排序参数
		if (orderParams == null) {
			orderParams = new ArrayList<Map<String, Object>>();
		}
		// 创建排序项目
		Map<String, Object> orderParam = new HashMap<String, Object>();
		orderParam.put("name", paramName);
		orderParam.put("direction", "desc");
		// 加入列表
		orderParams.add(orderParam);

	}

	/**
	 * 添加查询参数
	 * 
	 * 
	 * 开发时间：2019年4月25日 下午6:18:55
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 * @param paramValue
	 * @param pattern
	 */
	public void addDateTimeQueryParam(String paramName, Date paramValue, String pattern) {

		if (paramValue != null) {

			if (urlParamsBuilder == null) {
				urlParamsBuilder = new StringBuilder();
			}

			// 日期时间类型
			urlParamsBuilder.append("&" + paramName + "=");
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			urlParamsBuilder.append(sdf.format(paramValue));
			// 返回参数集合
			if (returnParamMap == null) {
				returnParamMap = new HashMap<String, Object>();
			}
			returnParamMap.put(paramName, paramValue);

			// 封装查询条件
			if (queryParamMap == null) {
				queryParamMap = new HashMap<String, Object>();
			}
			queryParamMap.put(paramName, paramValue);

		}

	}

	/**
	 * 添加查询参数
	 * 
	 * 
	 * 开发时间：2019年4月25日 下午6:11:20
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 * @param paramValue
	 */
	public void addQueryParam(String paramName, Object paramValue) {
		if (paramValue != null && !"".equals(paramValue) && !"%%".equals(paramValue) && !"%".equals(paramValue)
				&& !"%null%".equals(paramValue) && !"%null".equals(paramValue) && !"null%".equals(paramValue)) {
			if (urlParamsBuilder == null) {
				urlParamsBuilder = new StringBuilder();
			}
			if (paramValue instanceof String) {
				String paramValueStr = paramValue.toString();
				try {
					// 解决中文乱码
					// paramValueStr = new String(paramValueStr.getBytes("iso-8859-1"), "utf-8");
				} catch (Exception e) {
					e.printStackTrace();
				}
				// url的参数
				urlParamsBuilder.append("&" + paramName + "=");
				urlParamsBuilder.append(paramValueStr.replaceAll("[%]", ""));
				// 返回参数集合
				if (returnParamMap == null) {
					returnParamMap = new HashMap<String, Object>();
				}
				returnParamMap.put(paramName, paramValueStr.replaceAll("[%]", ""));
				// 查询参数
				paramValue = paramValueStr;
			} else if (paramValue instanceof Date) {
				// 日期类型
				urlParamsBuilder.append("&" + paramName + "=");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				urlParamsBuilder.append(sdf.format(paramValue));
				// 返回参数集合
				if (returnParamMap == null) {
					returnParamMap = new HashMap<String, Object>();
				}
				returnParamMap.put(paramName, paramValue);
			} else {
				// url的参数
				urlParamsBuilder.append("&" + paramName + "=");
				urlParamsBuilder.append(paramValue);
				// 返回参数集合
				if (returnParamMap == null) {
					returnParamMap = new HashMap<String, Object>();
				}
				returnParamMap.put(paramName, paramValue);
			}
			// 封装查询条件
			if (queryParamMap == null) {
				queryParamMap = new HashMap<String, Object>();
			}
			queryParamMap.put(paramName, paramValue);

		}
	}

	/**
	 * 读取查询参数
	 * 
	 * 
	 * 开发时间：2019年4月25日 下午6:15:29
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 * @return
	 */
	public Object getQueryParam(String paramName) {
		if (queryParamMap == null) {
			return null;
		}
		return queryParamMap.get(paramName);
	}

	/**
	 * 读取参数参数
	 * 
	 * 
	 * 开发时间：2019年4月25日 下午6:16:16
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public Map<String, Object> getQueryParamMap() {

		// 查询参数
		if (queryParamMap == null) {
			queryParamMap = new HashMap<String, Object>();
		} else {
			queryParamMap = new HashMap<String, Object>(queryParamMap);
		}

		// 分页参数
		queryParamMap.put("beginIndex", getBeginIndex());
		queryParamMap.put("pageSize", getPageSize());

		// 排序参数
		if (orderParams != null && orderParams.size() > 0) {
			queryParamMap.put("orderParams", orderParams);
		}

		// 返回函数的值
		return queryParamMap;

	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		if (pageIndex == null || pageIndex <= 0) {
			this.pageIndex = 1;
			return;
		}
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize == null || pageSize <= 0) {
			this.pageSize = 10;
			return;
		}
		this.pageSize = pageSize;
	}

	public List<T> getCurrentPageList() {
		return currentPageList;
	}

	public void setCurrentPageList(List<T> currentPageList) {
		this.currentPageList = currentPageList;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {

		if (totalRecord == null) {
			throw new RuntimeException("总记录数不能为空。");
		}

		// 总记录数
		this.totalRecord = totalRecord;
		// 计算总计页数
		totalPage = totalRecord / pageSize;
		if (totalRecord % pageSize > 0) {
			totalPage++;
		}
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	/**
	 * 起始点的序号
	 * 
	 * @return
	 */
	public Integer getBeginIndex() {
		if (pageIndex == null || pageIndex <= 0 || pageSize == 0 || pageSize <= 0) {
			return 0;
		}
		return (pageIndex - 1) * pageSize;
	}

	/**
	 * 返回函数
	 * 
	 * @return
	 */
	public Map<String, Object> getParams() {
		if (returnParamMap == null) {
			returnParamMap = new HashMap<String, Object>();
		} else {
			returnParamMap = new HashMap<String, Object>(returnParamMap);
		}
		return returnParamMap;
	}

	/**
	 * url的参数
	 * 
	 * 
	 * 开发时间：2019年4月25日 下午7:22:16
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	public String getUrlParams() {
		// url的参数
		String urlParams = "";
		if (urlParamsBuilder != null) {
			urlParams = urlParamsBuilder.toString();
		}
		return urlParams;
	}

}
