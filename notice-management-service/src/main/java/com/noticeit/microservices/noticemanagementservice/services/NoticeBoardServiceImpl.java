/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.services;

import com.noticeit.microservices.noticemanagementservice.services.NoticeBoardService;
import com.noticeit.microservices.noticemanagementservice.repositories.NoticeBoardRepository;
import com.noticeit.microservices.noticemanagementservice.models.NoticeBoard;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vbhardwaj1
 */
@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {
     // private static final Logger LOGGER = LogManager.getLogger(NoticeBoardServiceImpl.class);
       
    @Autowired
    private NoticeBoardRepository nbRepositoryDAO;
    
    @Override
    public NoticeBoard createNoticeBoard(NoticeBoard campaign) {
        // LOGGER.debug("Creating new campaign with id: " + campaign.getId());
        return nbRepositoryDAO.save(campaign);
    }
    
    @Override
    public List<NoticeBoard> getAllNoticeBoards() {
        // LOGGER.debug("Getting all campaigns for page size: ");
        return nbRepositoryDAO.findAll();
    }
    
}
