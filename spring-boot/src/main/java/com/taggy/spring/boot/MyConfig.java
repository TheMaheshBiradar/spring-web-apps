package com.taggy.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Mahesh on 25-09-2017.
 */
@Configuration // this declares that beans will be defined and put it to IOC
public class MyConfig {


    @Bean
    public String sayHello(){

        return "Say Hello to Spring boot user";
    }
}
