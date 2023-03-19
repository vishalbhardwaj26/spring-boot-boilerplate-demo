/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.repositories;

import com.noticeit.microservices.noticemanagementservice.models.NoticeBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vbhardwaj1
 */
@Repository
public interface NoticeBoardRepository extends MongoRepository<NoticeBoard, String> {
  
    
    
}
