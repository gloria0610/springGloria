package com.learn.springgloria.controller;

import com.learn.springgloria.model.User;
import com.learn.springgloria.service.impl.regist.IUserRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testRegist")
@EnableAutoConfiguration
public class UserRegistController {


        @Autowired
        private IUserRegistService userRegistService;

        @RequestMapping(value = "/userRegist")
        public void insertOrUpdateUserBasic(@RequestBody User user){
            userRegistService.insertOrUpdateUserBasic(user);
        }

}
