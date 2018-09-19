package com.bjtu.cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bjtu.cloud.user.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "/getById", method = RequestMethod.POST)
	@ResponseBody
	public String findById(@RequestBody Long id) {
		//return userService.getUserById(id);
		return "hello aaa!!!";
	}
	
}
