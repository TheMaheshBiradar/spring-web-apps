package com.taggy.spring.eventlistener;

import org.springframework.context.ApplicationEvent;

public class BeanCreationEvent extends ApplicationEvent {

	/**
	 * 
	 * 
	 * 
	 **/
	
	private static final long serialVersionUID = 6595375254164933060L;

	public BeanCreationEvent(Object source) {
		super(source);
		
	}
	
	@Override
	public String toString() {
		
		return "BeanCreationEvent Event Created";
	}

}
