package com.bjtu.cloud.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name= "user-server")
public interface UserService {
	
	@PostMapping(value = "/user/getById")
	public String getById(Long id);
	
}