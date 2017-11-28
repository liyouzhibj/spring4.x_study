package com.smart.service;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

/**
 * @description user测试
 * @create by lijing on 2017-11-28 0:59
 **/
@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Test
    public void hasMatchUser(){
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "111111");
        assertTrue(b1);
        assertTrue(!b2);
    }

    @Test
    public void findUserByUserName(){
        User user = userService.findUserByUserName("admin");
        assertEquals(user.getUserName(), "admin");
    }

}
