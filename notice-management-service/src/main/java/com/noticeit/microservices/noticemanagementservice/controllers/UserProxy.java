package com.noticeit.microservices.noticemanagementservice.controllers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(name = "user-management-service", fallback = UserProxyFallback.class)
public interface UserProxy {   
    
    @GetMapping("/usermgmts/helloboards/HelloFromUser")
    String GetUserHelloWorld();
}

