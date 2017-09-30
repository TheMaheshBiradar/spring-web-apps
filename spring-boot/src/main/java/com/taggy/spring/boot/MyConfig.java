package com.taggy.spring.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Mahesh on 25-09-2017.
 */
@Configuration // this declares that beans will be defined and put it to IOC
public class MyConfig {


    @Bean
    public String sayHello(){

        return "Say Hello to Spring boot user";
    }


    @Bean
    @Profile("dev")
    public TechnicalUser getTechnicalUser(){

        return new TechnicalUser("dev");
    }

    @Bean
    @Profile("prod")
    public TechnicalUser getTechnicalUserProd(){


        return new TechnicalUser("prod");
    }


}
