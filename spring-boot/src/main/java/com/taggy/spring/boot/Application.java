package com.taggy.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class Application {


    @Value("${user}")
    private String name;


    @Value("{'${address.login}'.substring(1,'${address.login}'.length()-1)}")
    private String url;


    @Autowired
    private String text;

    @RequestMapping(path ="/")
    public String sayHello(){

        return "Hi "+name +text;
    }


    @RequestMapping(path ="/url")
    public String getUrl(){

        return url;
    }
    public static void main(String [] args){

        SpringApplication.run(Application.class,args);

    }
}
