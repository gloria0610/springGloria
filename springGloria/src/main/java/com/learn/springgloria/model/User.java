package com.learn.springgloria.model;

import java.util.Date;

//User类结构
public class User {

    //包含id,email,password,username几个参数
    private long id;
    private String telephone;
    private String email;
    private String password;
    private String username;

    // 账户Id
    private String accountId;

    // 注册时间
    private Date registTime;

    // 更新时间
    private Date updateTime;

    // 状态
    private Integer status;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAccountId() {
        return accountId;
    }

    public Date getRegistTime() {
        return registTime;
    }


    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getupdateTime() {
        return updateTime;
    }

    public void setupdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id='" + id + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", accountId='" + accountId + '\'' +
                ", registTime='" + registTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
