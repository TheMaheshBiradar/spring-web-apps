package com.taggy.spring.annotations;

public class Loan {
	
	private String loanType;
	
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanType() {
		return loanType;
	}

	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + "]";
	}

	
	
	
}
