/**
 * 
 * 
 * 创建时间：2019年4月7日 下午3:00:15
 * @author：moshco zhu
 */
package top.moshco.mysuit.commons;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 系统配置
 * 
 * 创建时间：2019年4月7日 下午3:00:15
 * 
 * @author moshco zhu
 * 
 */
public class SysConfiguration implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(SysConfiguration.class);

	// 单例
	public static SysConfiguration self = null;

	/**
	 * 初始化
	 * 
	 * 
	 * 开发时间：2019年4月7日 下午9:58:09
	 * 
	 * @author：moshco zhu
	 */
	@PostConstruct
	public void init() {
		logger.info("系统配置参数对象[SysConfiguration]已经被实例化。");
		self = this;
	}

	// 应用程序标题
	@Value("${mysuit.appTitle}")
	public String appTitle = null;

	// 应用程序描述
	@Value("${mysuit.appDescription}")
	public String appDescription = null;

	// 应用程序的关键字
	@Value("${mysuit.appKeywords}")
	public String appKeywords = null;

	// 环境：dev-开发环境 test-测试环境 product-生产环境
	@Value("${mysuit.environmental}")
	public String environmental = null;

	// 项目域名
	@Value("${mysuit.domain-name}")
	public String domainName = null;

	// 编码格式
	@Value("${mysuit.encoding}")
	public String encoding = null;

}
