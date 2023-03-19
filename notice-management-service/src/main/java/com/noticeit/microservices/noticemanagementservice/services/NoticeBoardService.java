/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.services;

import com.noticeit.microservices.noticemanagementservice.models.NoticeBoard;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author vbhardwaj1
 */
public interface NoticeBoardService {
    NoticeBoard createNoticeBoard(NoticeBoard nb);
    List<NoticeBoard> getAllNoticeBoards();
    
}
