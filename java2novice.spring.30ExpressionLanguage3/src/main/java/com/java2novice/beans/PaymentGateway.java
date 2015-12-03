package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("paymentGateway")
public class PaymentGateway {

	@Value("#{beanOrder.item}")
	private String itemName;

	@Value("#{beanOrder}")
	private Order order;

	@Value("#{beanOrder.getDescription('LOG ENTRY')}")
	private String orderDesc;

	public void setOrder(Order ord) {
		this.order = ord;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Order getOrder() {
		return order;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public void processOrder() {
		System.out.println("Processing order: " + order.getItem());
	}
}
