package com.taggy.spring.context;

/**
 * Spring bean
 * 
 */
public class Loan {
	private String loanNumber;
	private Account account;
	
	
	public Loan() {
		this.loanNumber="Xonstructor LOAN";
		System.out.println("Constructor Loan");
		
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void processLoan() {
		System.out.println("Loan is Approved for account :"+account.getName() +"Loan number is ***"+loanNumber);

	}
}