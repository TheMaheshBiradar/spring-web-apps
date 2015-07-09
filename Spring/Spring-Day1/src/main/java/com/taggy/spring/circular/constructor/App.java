package com.taggy.spring.circular.constructor;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-circularContext.xml");
		//Account obj = (Account) context.getBean("account");
		//obj.withdraw();
		
		//Account obj2 = (Account) context.getBean("account");
		//obj2.withdraw();
		
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(new File("src/main/resources/constructor-circularContext.xml")));
		Account ob1j = (Account) beanFactory.getBean(Account.class);
		
		/*Loan loan= beanFactory.getBean(Loan.class);
		loan.processLoan();*/
	}
}
