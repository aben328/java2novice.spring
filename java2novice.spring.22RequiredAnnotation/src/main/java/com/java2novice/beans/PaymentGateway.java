package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Required;

/**
 * @see http://java2novice.com/spring/dependency-check-required-annotation/
 * @author java2novice
 * @date 2015年12月2日下午8:40:26
 */
public class PaymentGateway {

	private String client;

	private Order order;

	@Required
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
