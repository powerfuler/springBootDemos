package com.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot Controller层类，启动完成后直接在界面访问"http://localhost:8091/hello" 
 * 获取接口返回信息
 * 
 * @author djm
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}