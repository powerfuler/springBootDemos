package com.demo3.web;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello1")
	public String hello(Locale locale, Model model) {
		return "Hello World";
	}

}