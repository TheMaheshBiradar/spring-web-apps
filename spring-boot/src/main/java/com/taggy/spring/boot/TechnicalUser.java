package com.taggy.spring.boot;

/**
 * Created by Mahesh on 30-09-2017.
 */
public class TechnicalUser {

    private String userId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TechnicalUser(String userId) {
        this.userId = userId;
    }
}
