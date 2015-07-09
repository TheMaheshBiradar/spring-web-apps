package com.taggy.spring.beanpostprocessor;

import java.util.List;


/**
 * Spring bean
 * 
 */
public class Account {
	private String name;
	private Loan personalLoan;
	private Loan carLoan;
	private Loan homeLoan;
	
	private List<Loan> loans;
	
	
	public Account() {
		this.name = "Constructior HDFC";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Loan getPersonalLoan() {
		return personalLoan;
	}

	public void setPersonalLoan(Loan personalLoan) {
		this.personalLoan = personalLoan;
	}

	public Loan getCarLoan() {
		return carLoan;
	}

	public void setCarLoan(Loan carLoan) {
		this.carLoan = carLoan;
	}

	public Loan getHomeLoan() {
		return homeLoan;
	}

	public void setHomeLoan(Loan homeLoan) {
		this.homeLoan = homeLoan;
	}

	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", personalLoan=" + personalLoan
				+ ", carLoan=" + carLoan + ", homeLoan=" + homeLoan
				+ ", loans=" + loans + "]";
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	

}