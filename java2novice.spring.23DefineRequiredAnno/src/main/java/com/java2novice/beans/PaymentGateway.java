package com.java2novice.beans;

import com.java2novice.utils.Mandatory;

public class PaymentGateway {

	private String client;

	private Order order;

	@Mandatory
	public void setOrder(Order ord) {
		this.order = ord;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Order getOrder() {
		return order;
	}

	public void processOrder() {
		System.out.println("Processing order: " + order.getItem());
	}
}
