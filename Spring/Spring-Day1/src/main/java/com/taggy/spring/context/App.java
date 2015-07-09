package com.taggy.spring.context;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		//Account obj = (Account) context.getBean("account");
		//obj.withdraw();
		
		//Account obj2 = (Account) context.getBean("account");
		//obj2.withdraw();
		
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(new File("src/main/resources/SpringBeans.xml")));
		Account ob1j = (Account) beanFactory.getBean(Account.class);
		//ob1j.withdraw();
		
		Loan loan= beanFactory.getBean(Loan.class);
		loan.processLoan();
		
		Loan loan1= (Loan) beanFactory.getBean("bean1");
		loan1.processLoan();
	}
}
