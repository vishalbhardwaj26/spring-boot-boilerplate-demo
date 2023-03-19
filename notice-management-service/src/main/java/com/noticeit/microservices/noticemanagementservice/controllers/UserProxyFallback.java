/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.controllers;

import org.springframework.stereotype.Component;

/**
 *
 * @author vbhardwaj1
 */

@Component
public class UserProxyFallback implements UserProxy {

    @Override
    public String GetUserHelloWorld() {
      // Degraded service: no suggestion to offer
      return "failure";
    }

}
