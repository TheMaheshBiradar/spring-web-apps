package com.taggy.spring.collection;

import java.util.List;

/**
 * Spring bean
 * 
 */
public class Account {
	private String name;
	private List<Loan> loans;
	

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw() {
		System.out.println("WithDraw Money from Account : " + name);
	}
	
	public Account() {
		this.name="Constructior HDFC";
		System.out.println("Account Constructor: " + name);
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	public List<Loan> getLoans() {
		return loans;
	}
}