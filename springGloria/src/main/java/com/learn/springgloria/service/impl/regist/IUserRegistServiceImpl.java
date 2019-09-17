package com.learn.springgloria.service.impl.regist;

import com.learn.springgloria.dao.regist.IUserRegistDAO;
import com.learn.springgloria.model.User;
import com.learn.springgloria.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userRegistService")
public class IUserRegistServiceImpl implements IUserRegistService {
    @Autowired
    private IUserRegistDAO userRegistDAO;

    public void insertOrUpdateUserBasic(User user){
        userRegistDAO.insertOrUpdateUserBasic(user);
    }
}
