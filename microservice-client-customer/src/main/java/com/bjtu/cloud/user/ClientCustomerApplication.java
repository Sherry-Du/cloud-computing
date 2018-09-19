package com.bjtu.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //@EnableDiscoveryClient
@EnableFeignClients
public class ClientCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCustomerApplication.class, args);
	}
}
