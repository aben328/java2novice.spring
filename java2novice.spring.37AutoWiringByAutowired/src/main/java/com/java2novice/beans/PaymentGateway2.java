
package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Autowired annotation on setter method:
 * @author Ben
 * @date 2015年12月3日下午5:21:52
 */
public class PaymentGateway2 {

	private Order order;

	public Order getOrder() {
		return order;
	}

	@Autowired
	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}
