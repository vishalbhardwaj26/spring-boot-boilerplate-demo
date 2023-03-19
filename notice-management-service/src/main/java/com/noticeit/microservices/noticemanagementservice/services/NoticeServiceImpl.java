/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.services;

import com.noticeit.microservices.noticemanagementservice.models.Notice;
import com.noticeit.microservices.noticemanagementservice.repositories.NoticeRepository;
import com.noticeit.microservices.noticemanagementservice.errors.ApiException;
import com.noticeit.microservices.noticemanagementservice.errors.ErrorType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vbhardwaj1
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeRepository nRepositoryDAO;

    @Override
    public List<Notice> getAllNotices() {
        return nRepositoryDAO.findAll();
    }

    @Override
    public Notice getNoticeById(String noticeId) {
        return nRepositoryDAO.findById(noticeId).orElseThrow(() ->  {
           // LOGGER.warn("Campaign id: " + campaignId + " not found!");
           return new ApiException(ErrorType.NOTICE_NOT_FOUND, noticeId);
       });
    }

    @Override
    public Notice createNotice(Notice notice) {
        return nRepositoryDAO.save(notice);
    }

    @Override
    public Notice updateNotice(Notice notice){
       String noticeId = notice.getId();       
        if (nRepositoryDAO.existsById(noticeId)) {
            // LOGGER.debug("Updating campaign with id: " + noticeId);
            return nRepositoryDAO.save(notice);
        } else {
            // LOGGER.warn("Campaign id: " + campaignId + " not found!");
            // throw new example.api.rest.errors.ApiException(ErrorType.NOTICE_NOT_FOUND, noticeId);
        }
        return null;        
    }

    @Override
    public void deleteNoticeById(String noticeId) {
        nRepositoryDAO.deleteById(noticeId);
    }

}
