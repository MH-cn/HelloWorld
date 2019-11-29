/**
 * 
 * 
 * 创建时间：2019年10月18日 下午3:00:50
 * @author：moshco zhu
 */
package com.moshco.springboot.helloworld.cotroller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world
 * 
 * 创建时间：2019年10月18日 下午3:00:50
 * @author moshco zhu
 * 
 */
@RestController
public class HelloWorldController implements Serializable {

	/**
	 * 问好
	 * 
	 * 
	 * 开发时间：2019年10月18日 下午3:02:37
	 * @author：moshco zhu
	 * @return
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello,SpringBoot!";
	}
	
}
