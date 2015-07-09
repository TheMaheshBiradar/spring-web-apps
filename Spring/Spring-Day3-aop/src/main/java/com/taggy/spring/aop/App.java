package com.taggy.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aop-simple.xml");
		CreditCardService creditCardService = (CreditCardService) context.getBean("creditCardService");
		creditCardService.transactTikets(new String[]{null,"mahesh","cognizant"});
		creditCardService.transactTikets();//new String[]{null,"mahesh","cognizant"});
		
	}
}
