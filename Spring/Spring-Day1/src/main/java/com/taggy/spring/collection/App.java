package com.taggy.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
		Account obj = (Account) context.getBean("account");
		System.out.println(obj.getLoans());
		
}
}
