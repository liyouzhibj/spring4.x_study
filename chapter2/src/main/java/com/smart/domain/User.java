package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @description 用户
 * @create by lijing on 2017-11-27 14:29
 **/

@Data
public class User implements Serializable{
    private int userId;
    private String userName;
    private String password;
    private int credits;
    private String lastIp;
    private Date lastVisit;
}
