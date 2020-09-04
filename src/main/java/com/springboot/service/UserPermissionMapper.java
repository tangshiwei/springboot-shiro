package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import com.springboot.pojo.Permission;
import org.springframework.stereotype.Service;

@Service
public class UserPermissionMapper {
	
	public List<Permission> findByUserName(String userName){
		List<Permission> list=new ArrayList<>();
		list.add (new Permission(1, "/user", "user:find"));
		list.add (new Permission(2, "/user/add", "user:add"));
		//list.add (new Permission(3, "/user/delete", "user:delete"));

		return list;
	}
}
