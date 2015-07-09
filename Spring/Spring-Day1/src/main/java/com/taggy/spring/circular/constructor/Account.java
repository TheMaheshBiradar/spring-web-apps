package com.taggy.spring.circular.constructor;

/**
 * Spring bean
 * 
 */
public class Account {
	private Loan loan;

	public Account(Loan loan) {
		this.loan = loan;
		System.out.println("Constructor Account");
		
	}
}