package com.example.springbootlog4j.gui.orgnization.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {

    private Integer id;

    private String username;

    private String password;

    private String tel;

    private String email;

    private String realname;

    private Date createTime;

    private Date updateTime;

    private String creator;

    private String updater;
}

