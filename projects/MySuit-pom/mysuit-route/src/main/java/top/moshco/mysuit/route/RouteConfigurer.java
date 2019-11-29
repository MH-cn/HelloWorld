/**
 * 
 * 
 * 创建时间：2019年11月18日 下午3:20:53
 * @author：moshco zhu
 */
package top.moshco.mysuit.route;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置
 * 
 * 创建时间：2019年11月18日 下午3:20:53
 * 
 * @author moshco zhu
 * 
 */
@Configuration
public class RouteConfigurer implements WebMvcConfigurer {

	// @Autowired
	// private DemoInterceptor demoInterceptor = null;

	/**
	 * 微服务调用（具备负载均衡）
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午3:21:40
	 * 
	 * @author：moshco zhu
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * 拦截器的配置
	 * 
	 * 
	 * 开发时间：2019年11月18日 下午3:21:51
	 * 
	 * @author：moshco zhu
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 身份认证拦截器-管理平台
		// registry.addInterceptor(demoInterceptor).addPathPatterns("/**");
	}

}
