package com.bjtu.cloud.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjtu.cloud.user.dao.UserRepository;
import com.bjtu.cloud.user.entity.User;
import com.bjtu.cloud.user.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getUserById(Long id) {
		User user = userRepository.findOne(id);
		return user;
	}

}
