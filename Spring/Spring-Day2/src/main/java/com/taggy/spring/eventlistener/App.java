package com.taggy.spring.eventlistener;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("eventListener.xml");
		Account account=(Account) context.getBean("account");
		account.getName();
		//context.registerShutdownHook();
	}
}
