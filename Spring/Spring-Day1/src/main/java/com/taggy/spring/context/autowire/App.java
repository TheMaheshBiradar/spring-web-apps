package com.taggy.spring.context.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		Loan loan=(Loan) context.getBean("loan");
		loan.processLoan();
	}
}
