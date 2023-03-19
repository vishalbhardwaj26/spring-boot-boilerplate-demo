/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.controllers;

import com.noticeit.microservices.noticemanagementservice.models.Notice;
import com.noticeit.microservices.noticemanagementservice.services.NoticeService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vbhardwaj1
 */
@RestController
@RequestMapping(value = "/notices")
public class NoticeController {
    @Autowired
    private NoticeService nService;


    @GetMapping("/")
    public List<Notice> getNotices() {
        return nService.getAllNotices();

    }    

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Notice createNotice(@RequestBody Notice notice) {
        return this.nService.createNotice(notice);
    }
    
    @RequestMapping(value = "/{noticeId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Notice updateNotice(@Valid @RequestBody Notice notice, @PathVariable("noticeId") String noticeId) {
        
        notice.setId(noticeId);
        return this.nService.updateNotice(notice);
    }
    
      
    @RequestMapping(value = "/{noticeId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Notice getNoticeById(@PathVariable("noticeId") String noticeId) {
        
        return this.nService.getNoticeById(noticeId);
    }
    
    @RequestMapping(value = "/{noticeId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNotice(@PathVariable("noticeId") String noticeId) {
        // LOGGER.info("Entering in rest endpoint to delete the campaign");
        this.nService.deleteNoticeById(noticeId);
    }
    
}
