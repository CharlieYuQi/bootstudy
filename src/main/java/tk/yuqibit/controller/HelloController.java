/*
 * Project: boot
 * 
 * File Created at 2016年12月20日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package tk.yuqibit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.yuqibit.service.UserService;

/**
 * @Type HelloController.java
 * @Desc 
 * @author yuqi
 * @date 2016年12月20日 上午10:43:13
 * @version 
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public String index() {
        try {
            userService.create("admin","123456");
            userService.create("yuqi","yuqi1234");
        } catch (Exception e) {
            // TODO: handle exception
        }

        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/except")
    public String except() throws Exception {
        throw new Exception("test");
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年12月20日 yuqi creat
 */