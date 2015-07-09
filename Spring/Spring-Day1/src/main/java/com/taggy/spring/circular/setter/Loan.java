package com.taggy.spring.circular.setter;

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
		System.out.println("setAccount in  Loan");
	}
	
	public void processLoan() {
		System.out.println("Loan is Approved for account :"+account.getName() +"Loan number is ***"+loanNumber);

	}
	
}