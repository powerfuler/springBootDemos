package com.neo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

	@RequestMapping("/hello")
	public String hello(Map<String,Object> map) {
		
		map.put("msg", "Hello Freemarker");
		return "hello";
	}
}