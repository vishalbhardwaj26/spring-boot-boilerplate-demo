/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.models;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author vbhardwaj1
 */
@Document(collection = "noticeboards")
public class NoticeBoard {
    
    @Id
    private String id;

    private String title;
    private String description;
    private List<String> tags;
    private String organizationId;
    private boolean isPrivate;

    public boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

  

    public NoticeBoard() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NoticeBoard(String name, String description) {
        this.title = name;
        this.description = description;
    }

    
    
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    
    

}
