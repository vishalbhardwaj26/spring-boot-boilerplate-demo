/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.services;

import com.noticeit.microservices.noticemanagementservice.models.Notice;
import java.util.List;

/**
 *
 * @author vbhardwaj1
 */
public interface NoticeService {
    
   List<Notice> getAllNotices();
    
   Notice getNoticeById(String noticeId);

   Notice createNotice(Notice notice);

   Notice updateNotice(Notice notice);

   void deleteNoticeById(String noticeId);
    
}
