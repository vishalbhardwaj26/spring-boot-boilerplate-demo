package com.noticeit.microservices.usermanagementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@RequestMapping(value = "/helloboards")
public class UserManagementServiceApplication {
    @Autowired
    private Environment environment;
    
    @RequestMapping("/Hello")
    public String home() {
        return "Hello world" + environment.getProperty("local.server.port");
    }
    
    @RequestMapping("/HelloFromUser")
    public String GetUserHelloWorld() {
        return "Hello world From User" + environment.getProperty("local.server.port");
    }

	public static void main(String[] args) {
		SpringApplication.run(UserManagementServiceApplication.class, args);
	}

}
