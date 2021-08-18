package com.example.test.entity;

import java.io.Serializable;

/**
 * 用户账号表(Account)实体类
 *
 * @author makejava
 * @since 2021-06-17 12:27:37
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -75911794449161894L;
    /**
    * 主键，自增
    */
    private Integer id;
    /**
    * 登录名
    */
    private String loginName;
    /**
    * 登录密码
    */
    private String loginPwd;
    /**
    * 真实姓名
    */
    private String name;
    /**
    * 手机号
    */
    private String mobile;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}