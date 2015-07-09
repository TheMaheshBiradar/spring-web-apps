package com.taggy.spring.property.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("propertyLoaderContext.xml");
		Account account=(Account)context.getBean("account");
		System.out.println(account.getName());
		System.out.println(account.getType());
	}
}
