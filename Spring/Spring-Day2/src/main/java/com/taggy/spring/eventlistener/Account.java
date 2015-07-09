package com.taggy.spring.eventlistener;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;


/**
 * Spring bean
 * 
 */
@Component
public class Account implements ApplicationEventPublisherAware{

	private String name;

	private ApplicationEventPublisher applicationEventPublisher;
	
	
	public Account() {
		this.name = "Constructior HDFC";
	}

	public String getName() {
		applicationEventPublisher.publishEvent(new BeanCreationEvent(this));
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}


}