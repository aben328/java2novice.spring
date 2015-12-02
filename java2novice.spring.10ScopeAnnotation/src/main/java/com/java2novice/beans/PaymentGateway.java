package com.java2novice.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PaymentGateway {

	private Order order;

	public PaymentGateway(Order ord) {
		this.order = ord;
	}

	public void setOrder(Order ord) {
		this.order = ord;
	}

	public void processOrder() {
		System.out.println("Processing order: " + order.getItem());
	}
}
