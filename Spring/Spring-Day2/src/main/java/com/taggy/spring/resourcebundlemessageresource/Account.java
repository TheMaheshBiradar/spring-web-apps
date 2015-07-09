package com.taggy.spring.resourcebundlemessageresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


/**
 * Spring bean
 * 
 */
public class Account {

	
	private String name;
	@Autowired
	private MessageSource messageSource;

	public void createAccount() {
	System.out.println(messageSource.getMessage("account.type", null, "DFAULT",null));	
	}
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}