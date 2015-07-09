package com.taggy.spring.beaninheritence;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beaninheritence.xml");
		Account account=(Account) context.getBean("account");
		System.out.println(account);
		context.registerShutdownHook();
	}
}
