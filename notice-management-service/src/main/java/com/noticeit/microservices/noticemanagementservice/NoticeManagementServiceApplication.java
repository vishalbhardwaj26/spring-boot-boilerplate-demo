package com.noticeit.microservices.noticemanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class NoticeManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticeManagementServiceApplication.class, args);
	}

}
