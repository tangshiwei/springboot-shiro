package com.springboot.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@RequiresPermissions("user:user")
	@RequestMapping("list")
	public String userList(Model model) {
		model.addAttribute("value", "获取用户信息");
		return "user";
	}
	
	@RequiresPermissions("user:add")
	@RequestMapping("add")
	public String userAdd(Model model) {
		model.addAttribute("value", "新增用户");
		return "user";
	}

	//验证用户是否登录，等同于方法subject.isAuthenticated() 结果为true时。
	@RequiresPermissions("user:delete")
	@RequestMapping("delete")
	public String userDelete(Model model) {
		model.addAttribute("value", "删除用户");
		SecurityUtils.getSubject().hasRole("gust");
		return "user";
	}

	//验证用户是否登录，等同于方法subject.isAuthenticated() 结果为true时。
	@RequiresPermissions("user:delete")
	//验证角色，等同于方法subject.hasRole(“admin”)
	@RequestMapping("update")
	public String userUpdate(Model model) {
		SecurityUtils.getSubject().hasRole("gust");
		model.addAttribute("value", "修改用户");
		return "user";
	}
}
