/**
 * 
 * 
 * 创建时间：2019年10月18日 下午2:20:45
 * @author：moshco zhu
 */
package cn.itcast.springboot.helloworld.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world
 * 
 * 创建时间：2019年10月18日 下午2:20:45
 * @author moshco zhu
 * 
 */
@RestController
public class HelloController implements Serializable {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello springBoot!";
	}
	
	
}
