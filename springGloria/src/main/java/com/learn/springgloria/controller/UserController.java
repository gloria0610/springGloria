package com.learn.springgloria.controller;


import com.learn.springgloria.model.User;
import com.learn.springgloria.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user")
    public List<User> getUsers(){
        System.out.println(userService.selectUsers().get(7).getUsername()+userService.selectUsers().get(7).getupdateTime());
        return userService.selectUsers();

    }

}
