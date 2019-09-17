package com.learn.springgloria.dao;

import com.learn.springgloria.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDAO {
    List<User> selectUsers();


    User getUserBasicByTelephone(String telephone);

    /**
     * 根据用户Id查询用户基础信息
     *
     * @author YangDongzhen
     *
     * @param userId
     * @return UserBasic
     */
    public User getUserBasicByUserId(String userId);

    /**
     * 根据账户Id查询用户基础信息
     *
     * @author YangDongzhen
     *
     * @param accountId
     * @return UserBasic
     */
    public User getUserBasicByAccountId(String accountId);

    /**
     * 根据用户编码查询用户基础信息
     *
     * @author YangDongzhen
     *
     * @param userCode
     * @return UserBasic
     */

}
