package com.taggy.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


/**
 * Spring bean
 * 
 */
public class Account {
	private String name;
	
	
	
	private Loan homeLoan;
	private Loan carLoan;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Loan getHomeLoan() {
		return homeLoan;
	}

	
	@Required
	@Autowired
	@Qualifier("homeLoan2")
	public void setHomeLoan(Loan homeLoan) {
		this.homeLoan = homeLoan;
	}
	
	@Resource(name="homeLoan1")
	//@Resource
	public void setCarLoan(Loan carLoan) {
		this.carLoan = carLoan;
	}
	
	public Loan getCarLoan() {
		return carLoan;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@PreDestroy");
	}
	
}