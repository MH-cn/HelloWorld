/**
 * 
 * 
 * 创建时间：2019年10月18日 下午2:55:47
 * @author：moshco zhu
 */
package com.moshco.springboot.helloworld;

import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动的类
 * 
 * 创建时间：2019年10月18日 下午2:55:47
 * @author moshco zhu
 * 
 */
@SpringBootApplication
public class HelloWorldApplication implements Serializable {

	/**
	 * 入口函数值
	 *
	 * 开发时间：2019年10月18日 下午2:55:47
	 * @author：moshco zhu
	 * @param：args-传入的参数
	 * @return void
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
		
	}
}
