package com.user;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("========quartz 调用到了userService.save()的方法！==========");
	}

}
