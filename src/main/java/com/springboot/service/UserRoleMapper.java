package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import com.springboot.pojo.Role;
import org.springframework.stereotype.Service;

@Service
public class UserRoleMapper {
	
	public List<Role> findByUserName(String userName){
		List<Role> list=new ArrayList<>();
		list.add(new Role(1, "admin", "超级管理员"));
		list.add(new Role(2, "test", "测试账户"));
		return list;
	}
}
