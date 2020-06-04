package com.demo3.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo3.model.User;
import com.demo3.repository.UserRepository;
import com.demo3.util.NeoProperties;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private NeoProperties neoProperties;
	
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=userRepository.findByUserName("aa");
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return user;
    }
    
    @RequestMapping("/getUsers")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return users;
    }
    
    @RequestMapping("/getneoProperties")
    public String getneoProperties() {
    	return neoProperties.getTitle();
    }
    
    @RequestMapping("/getUser1")
    public User getUser1() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("xxxx");
        return user;
    }
}