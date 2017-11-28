package com.smart.web;

import lombok.Data;

/**
 * @description 登陆
 * @create by lijing on 2017-11-28 16:09
 **/

@Data
public class LoginCommand {
    private String userName;
    private String password;
}
