package com.learn.springgloria.dao.regist;

import com.learn.springgloria.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserRegistDAO {


        public void insertOrUpdateUserBasic(User user);


    }


