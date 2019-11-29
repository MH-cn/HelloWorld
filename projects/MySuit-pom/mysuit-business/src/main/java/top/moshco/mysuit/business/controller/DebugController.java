/**
 * 
 * 
 * 创建时间：2019年11月18日 下午5:56:26
 * @author：moshco zhu
 */
package top.moshco.mysuit.business.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import top.moshco.mysuit.business.service.BusinessService;
import top.moshco.mysuit.commons.entity.SysUser;

/**
 * 调式业务
 * 
 * 创建时间：2019年11月18日 下午5:56:26
 * 
 * @author moshco zhu
 * 
 */
@RequestMapping("/debug/")
@Controller
public class DebugController implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(DebugController.class);

	// 主要业务
	@Autowired
	private BusinessService businessService = null;

	/**
	 * 模拟登陆
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午5:57:52
	 * 
	 * @author：moshco zhu
	 * @param userId
	 * @return
	 */
	@RequestMapping("login")
	public String login(String userId) {

		// 读取request和response的对象
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getResponse();

		// 当前登录用户
		SysUser user = businessService.findSysUser(userId);
		String userName = user.getUserName();

		// 返回函数的值
		return "redirect:/home/main?userName=" + userName;

	}

}
