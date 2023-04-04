package com.baeksu.happylife.domain;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class Member {
    private String id;
    private String userId;
    private String password;
    private String name;
    private Date dateTime;
    private char gender;

    public Member(String userId, String password, String name, Date dateTime, char gender) {
        id = UUID.randomUUID().toString();
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.dateTime = dateTime;
        this.gender = gender;
    }
}
