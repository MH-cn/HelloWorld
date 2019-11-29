/**
 * 
 * 
 * 创建时间：2019年11月18日 下午6:17:16
 * @author：moshco zhu
 */
package top.moshco.mysuit.business.controller;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页业务
 * 
 * 创建时间：2019年11月18日 下午6:17:16
 * 
 * @author moshco zhu
 * 
 */
@RequestMapping("/home/")
@Controller
public class HomeController implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(HomeController.class);

	/**
	 * 主页
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午6:19:36
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("/main")
	public String main() {

		// 返回函数的值
		return "home/main";

	}

}
