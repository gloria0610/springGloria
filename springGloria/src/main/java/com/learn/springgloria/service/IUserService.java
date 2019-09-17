package com.learn.springgloria.service;

import com.learn.springgloria.model.User;

import java.util.List;

public interface IUserService {

    List<User> selectUsers();
}
