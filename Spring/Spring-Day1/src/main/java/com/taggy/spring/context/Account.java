package com.taggy.spring.context;

/**
 * Spring bean
 * 
 */
public class Account {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw() {
		System.out.println("WithDraw Money from Account : " + name);
	}
	
	public Account() {
		this.name="Constructior HDFC";
		System.out.println("WithDraw Money from Account : " + name);
	}
	
	public String getName() {
		return name;
	}
}