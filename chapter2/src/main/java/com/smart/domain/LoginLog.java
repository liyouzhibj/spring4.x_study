package com.smart.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description 登录日志
 * @create by lijing on 2017-11-27 14:34
 **/

@Data
public class LoginLog implements Serializable{
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;
}
