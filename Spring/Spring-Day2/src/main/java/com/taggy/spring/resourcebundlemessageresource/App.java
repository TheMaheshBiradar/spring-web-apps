package com.taggy.spring.resourcebundlemessageresource;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resourcebundlemessageresource.xml");
	
		Account account=(Account)context.getBean("account");
		account.createAccount();
		
		System.out.println(context.getMessage("account.type", new Object[]{"mahesh"}, "defaultMessage",Locale.SIMPLIFIED_CHINESE));
		
	
	}
}
