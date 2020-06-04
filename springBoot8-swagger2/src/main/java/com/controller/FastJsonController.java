package com.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "FastJson测试", tags = { "测试接口1" })
@RestController
@RequestMapping("fastjson")
public class FastJsonController {

	@ApiOperation("获取用户信息")
	@ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
	@GetMapping("/test/{name}")
	public User test(@PathVariable("name") String name) {
		User user = new User();

		user.setId(1);
		user.setUsername(name);
		user.setPassword("jack123");
		user.setBirthday(new Date());

		return user;
	}
	
    /**
    *
    * @param student
    * @param result
    * @return
    */
   @ApiOperation(value="获取用户详细信息", notes="根据name和id来获取用户详细信息")
   @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
   @PostMapping(value = "/find")
   @ResponseBody
   public Object finds(@RequestBody @Valid User user, BindingResult result) {
       System.out.println(user+"sd");
       return "ok";
   }
}