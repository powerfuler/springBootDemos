package com.neo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.delay.MessageServiceImpl;
import com.neo.rabbit.many.NeoSender;
import com.neo.rabbit.many.NeoSender2;

@RestController
public class UserController {
	
	@Autowired
	private NeoSender neoSender;
	@Autowired
	private NeoSender2 neoSender2;
	@Autowired
    private MessageServiceImpl messageService;

	@RequestMapping("/getManyToMany")
	public void getUsers() {
		for (int i=0;i<10;i++){
			neoSender.send(i);
			neoSender2.send(i);
		}
	}
	
	@RequestMapping("/sendDelayedMsg")
	public void sendDelayedMsg() throws InterruptedException {
		for (int i = 0; i < 10000; i++) {
			System.out.println("当前是第"+i+"次发消息！");
			messageService.sendMsg("test_queue_1","hello i am delay msg");
		}
        
    }
}