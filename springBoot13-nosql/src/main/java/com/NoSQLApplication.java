package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 添加 @EnableCaching 注解，开启缓存功能
 * @author dingjianmin
 *
 */
@EnableCaching
@SpringBootApplication
public class NoSQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoSQLApplication.class, args);
	}
}
