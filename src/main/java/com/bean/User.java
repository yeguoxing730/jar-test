package com.bean;

import java.io.Serializable;

/**
 * Created by yeguo on 2018/3/15.
 */
public class User implements Serializable{
    int userid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    String userName;
}
