package com.taggy.spring.aop;

import org.springframework.stereotype.Service;

//@Service(value="creditCardServiceCustomName")
@Service
public class CreditCardService {

	public boolean transactTikets(String ... ticketIds) {
		System.out.println("Inside transactTikets...."+ticketIds);
		return true;
	}
	
	public boolean transactTikets() {
		System.out.println("Inside transactTikets....");
		return true;
	}
	
}
