/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noticeit.microservices.noticemanagementservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

/**
 *
 * @author vbhardwaj1
 */
public enum ContentTypeEnum {

    TEXT("text"),
    Image ("image"),
    Video ("video");

    private String value;

    ContentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String toValue() {
        return value;
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(@JsonProperty("contentType") String value) {
        return Arrays.stream(values())
                .filter(contentType -> contentType.value.equalsIgnoreCase(value))
                .findFirst()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "contentType{"
                + "value='" + value + '\''
                + "} " + super.toString();
    }

}
