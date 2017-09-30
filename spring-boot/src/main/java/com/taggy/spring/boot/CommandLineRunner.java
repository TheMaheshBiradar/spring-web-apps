package com.taggy.spring.boot;

import org.springframework.stereotype.Component;

/**
 * Created by Mahesh on 30-09-2017.
 */
@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.print("*****************"+strings);
    }
}
