package com.mf.test03;

import java.io.Serializable;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 10:43
 * 想要序列化对象所对应的类，必须要实现一个接口Serializable
 */
public class User implements Serializable {
    private static final long serialVersionUID = 9050691344308365540L;//序列号
    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}

