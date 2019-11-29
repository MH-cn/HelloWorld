/**
 * 
 * 
 * 创建时间：2019年11月18日 下午3:27:31
 * @author：moshco zhu
 */
package top.moshco.mysuit.business;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 入口程序
 * 
 * 创建时间：2019年11月18日 下午3:27:31
 * 
 * @author moshco zhu
 * 
 */
//@EnableEurekaClient
@EnableScheduling
@MapperScan({ "top.moshco.mysuit.business.dao", "top.moshco.mysuit.commons.dao" })
@EnableDiscoveryClient
@SpringBootApplication
public class BusinessApplication implements Serializable {

	// 日志对象
	private final static Logger logger = Logger.getLogger(BusinessApplication.class);

	/**
	 * 入口函数值
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午3:29:29
	 * 
	 * @author：moshco zhu
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("正在启动[我的套件]业务平台服务......");

		// new
		// SpringApplicationBuilder(AdminWebApplication.class).web(WebApplicationType.SERVLET).run(args);

		SpringApplication.run(BusinessApplication.class, args);

	}

}
