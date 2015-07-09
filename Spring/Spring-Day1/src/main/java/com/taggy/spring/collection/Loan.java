package com.taggy.spring.collection;

/**
 * Spring bean
 * 
 */
public class Loan {
	private String loanNumber;
	
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + "]";
	}



}