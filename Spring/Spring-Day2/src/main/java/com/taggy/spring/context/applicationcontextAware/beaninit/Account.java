package com.taggy.spring.context.applicationcontextAware.beaninit;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring bean
 * 
 */
public class Account implements ApplicationContextAware,InitializingBean,DisposableBean {
	private String name;
	private ApplicationContext applicationContext;

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw() {
		System.out.println("WithDraw Money from Account : " + name);
	}

	public Account() {
		this.name = "Constructior HDFC";
		System.out.println("WithDraw Money from Account : " + name);
	}

	public String getName() {
		return name;
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {

		this.applicationContext = applicationContext;

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}
	
	public void myOwnInit() throws Exception {
		System.out.println("myOwnInit");
		
	}

	public void myOwnDestroy() throws Exception {
		System.out.println("myOwndestroy()");
		
	}
}