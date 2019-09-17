package com.learn.springgloria.service.impl;

import com.learn.springgloria.dao.IUserDAO;
import com.learn.springgloria.model.User;
import com.learn.springgloria.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDao;

    public List<User> selectUsers() {

        return userDao.selectUsers();
    }
}