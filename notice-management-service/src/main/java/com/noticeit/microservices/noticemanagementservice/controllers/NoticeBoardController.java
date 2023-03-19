/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.controllers;


import com.noticeit.microservices.noticemanagementservice.services.NoticeBoardService;
import com.noticeit.microservices.noticemanagementservice.models.NoticeBoard;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vbhardwaj1
 */
@RestController
@RequestMapping(value = "/noticeboards")
public class NoticeBoardController {

    @Autowired
    private NoticeBoardService nbService;
    
    @Autowired
    private Environment environment;
    
    @Autowired
    private UserProxy userProxy;

    @RequestMapping("/Hello")
    public String home() {
        return "Hello world:" + environment.getProperty("local.server.port") + environment.getProperty("INSTANCE");
    }
    
    @RequestMapping("/HelloWorldFromUserFromShop")
    public String HelloWorldFromUserFromShop() {
        return (this.userProxy.GetUserHelloWorld() + " : " + environment.getProperty("local.server.port") + " notice-mnagement-service-instace: " + environment.getProperty("INSTANCE"));
    }


    @GetMapping("/")
    public List<NoticeBoard> getNoticeBoards() {
        return nbService.getAllNoticeBoards();

    }    

    @PostMapping("/")
    public NoticeBoard addNewNoticeBoard(@RequestBody NoticeBoard nb) {
        return this.nbService.createNoticeBoard(nb);
    }

}
