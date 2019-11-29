/**
 * 
 * 
 * 创建时间：2019年11月18日 下午6:01:18
 * @author：moshco zhu
 */
package top.moshco.mysuit.business.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.moshco.mysuit.business.dao.BusinessDao;
import top.moshco.mysuit.commons.dao.MySuitBaseDao;
import top.moshco.mysuit.commons.entity.SysUser;

/**
 * 主要业务
 * 
 * 创建时间：2019年11月18日 下午6:01:18
 * 
 * @author moshco zhu
 * 
 */
@Service
public class BusinessService implements Serializable {

	// 主要业务
	@Autowired
	private BusinessDao businessDao = null;

	// 公共业务
	@Autowired
	private MySuitBaseDao mySuitBaseDao = null;

	/**
	 * 找寻用户
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午6:08:50
	 * 
	 * @author：moshco zhu
	 * @param userId
	 * @return
	 */
	@Transactional(readOnly = true)
	public SysUser findSysUser(String userId) {
		SysUser user = mySuitBaseDao.findSysUser(userId);
		return user;
	}

}
