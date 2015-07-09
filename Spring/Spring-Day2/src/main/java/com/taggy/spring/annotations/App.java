package com.taggy.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotations.xml");
		Account account=(Account) context.getBean("account");
		System.out.println(account.getHomeLoan());
		System.out.println(account.getCarLoan());
		
		Customer customer=(Customer) context.getBean("customer");
		
		System.out.println(customer.getCard());
		
		context.registerShutdownHook();
	}
}
