package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Dependency Check: When you use @Autowired, it will make dependency check to make sure proper auto-wiring on property.
 * If spring fails to find matching bean for auto-wiring, it throws an exception. If you don't dependency check, then
 * use "required" attribute of @Autowired annotation, and set it false. Here is an example:
 * @author java2novice
 * @date 2015年12月3日下午5:24:02
 */
public class PaymentGateway3 {
	private Order order;

	@Autowired(required = false)
	public PaymentGateway3(Order ord) {
		this.order = ord;
	}

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}
