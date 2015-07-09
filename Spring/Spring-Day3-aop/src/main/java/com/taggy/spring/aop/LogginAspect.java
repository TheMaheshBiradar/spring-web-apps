package com.taggy.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogginAspect {

	
	@Before("execution(public boolean transactTikets())")
	public void loggingAdvice() {
		System.out.println("Loggin the method name");
		
	}
	
	@After("execution(public boolean com.taggy.spring.aop.CreditCardService.transactTikets(..))")
	public void loggingAdviceAfter() {
		System.out.println("Loggin the method name loggingAdviceAfter");
		
	}
}
