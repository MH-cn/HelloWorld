/**
 * 
 * 
 * 创建时间：2019年11月18日 下午3:13:47
 * @author：moshco zhu
 */
package top.moshco.mysuit.route;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 入口程序
 * 
 * 创建时间：2019年11月18日 下午3:13:47
 * 
 * @author moshco zhu
 * 
 */
@EnableZuulProxy
@MapperScan("top.moshco.mysuit.route.dao")
//@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
public class RouteApplication implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(RouteApplication.class);

	/**
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午3:13:47
	 * 
	 * @author：moshco zhu
	 * @param args
	 */
	public static void main(String[] args) {
		
		logger.info("正在启动[我的套件]的路由器......");

		// new
		// SpringApplicationBuilder(RegistryCenterApplication.class).web(WebApplicationType.SERVLET).run(args);

		SpringApplication.run(RouteApplication.class, args);

	}

}
