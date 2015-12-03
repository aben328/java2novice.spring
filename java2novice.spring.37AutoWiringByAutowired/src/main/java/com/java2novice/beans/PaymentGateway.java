package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;

// @Autowired annotation on instance variable:
public class PaymentGateway {

	@Autowired
	private Order order;

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}