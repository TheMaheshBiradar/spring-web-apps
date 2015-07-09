package com.taggy.spring.circular.constructor;

/**
 * Spring bean
 * 
 */
public class Loan {
	private Account account;
	public Loan(Account account) {
		System.out.println("Constructor Loan");
		this.account = account;
		
	}
}