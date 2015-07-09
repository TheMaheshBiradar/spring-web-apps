package com.taggy.spring.context.applicationcontextAware.beaninit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontextAware.xml");
		Account account=(Account) context.getBean("account");
		context.registerShutdownHook();
	}
}
