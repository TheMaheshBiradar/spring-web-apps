package com.taggy.spring.property.loader;


/**
 * Spring bean
 * 
 */
public class Account {

	private String name;
	private String type;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
}