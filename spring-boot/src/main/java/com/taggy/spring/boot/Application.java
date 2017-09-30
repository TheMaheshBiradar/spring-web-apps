package com.taggy.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mahesh on 20-09-2017.
 */
@RestController
//@EnableAutoConfiguration
//@Import(com.taggy.spring.boot.MyConfig.class) // or else component scan
//componenet scan + configuration +enable auto configuration =@SpringBootAutoConfiguration
@SpringBootApplication
@EnableConfigurationProperties(value = Message.class)
public class Application {


    @Value("${user}")
    private String name;


    @Value("{'${address.login}'.substring(1,'${address.login}'.length()-1)}")
    private String url;


    @Autowired
    private String text;

    @Value("${myrandom.number}")
    private Integer randomNumber;

    @Value("${myrandom.string}")
    private String randomString;


    @RequestMapping(path ="/")
    public String sayHello(){

        return "Hi "+name +text;
    }

    @RequestMapping(path ="/randomNumber")
    public String randomNumber(){

        return "Hi Random Number is " +randomNumber;
    }

    @RequestMapping(path ="/randomString")
    public String randomString(){

        return "Hi Random String is " +randomString;
    }


    @RequestMapping(path ="/url")
    public String getUrl(){

        return url;
    }

    @Autowired
    private TechnicalUser technicalUser;

    @RequestMapping(path ="/technicalUser")
    public String getTechUser(){

        return technicalUser.getUserId();
    }


    @Autowired
    private Message message;

    @RequestMapping(path ="/message")
    public String getMessage(){

        return message.getMessage();
    }

    public static void main(String [] args){

        SpringApplication.run(Application.class,args);

    }
}
