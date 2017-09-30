package com.taggy.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Mahesh on 30-09-2017.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class Message {

    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String message) {

        this.message = message;
    }
}
