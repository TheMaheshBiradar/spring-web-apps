package com.taggy.spring.beanpostprocessor;

import java.util.List;

import org.springframework.beans.BeansException;


/**
 * Spring bean
 * 
 */
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization bean name "+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization bean name "+arg1);
		return arg0;
	}

}