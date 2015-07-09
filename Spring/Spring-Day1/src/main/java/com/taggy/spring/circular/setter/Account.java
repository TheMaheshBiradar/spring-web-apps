package com.taggy.spring.circular.setter;

/**
 * Spring bean
 * 
 */
public class Account {
	private String name;
	private Loan loan;

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw() {
		System.out.println("WithDraw Money from Account : " + name);
		
	}
	
	public Account() {
		this.name="Constructior HDFC";
		System.out.println("Constructor Account");
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setLoan(Loan loan) {
		System.out.println("setLoan in  Account");
		this.loan = loan;
	}
}