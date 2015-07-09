package com.taggy.spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessor.xml");
		Account account=(Account) context.getBean("account");
		System.out.println(account);
		context.registerShutdownHook();
	}
}
