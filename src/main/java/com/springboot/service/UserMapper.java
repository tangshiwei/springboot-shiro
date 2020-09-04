package com.springboot.service;


import com.springboot.pojo.User;
import com.springboot.util.MD5Utils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserMapper {
	public User findByUserName(String userName){
		User user=null;
		if("swt".equals(userName)){
			user=new User();
			user.setId(1);
			user.setUserName("swt");
			//user.setPassword("123456");
			user.setPassword(MD5Utils.encrypt(userName,"123456"));
			user.setCreateTime(new Date());
			user.setStatus("1");
		}

		return user;
	}
}
