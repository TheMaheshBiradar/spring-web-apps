package com.taggy.spring.annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component
//@Service
//@Repository
@Controller
public class Card {
	
	private String card;

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	
	
	

}
