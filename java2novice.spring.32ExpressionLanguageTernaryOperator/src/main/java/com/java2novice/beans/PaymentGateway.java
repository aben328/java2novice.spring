package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Spring expression language ternary operator(三元表达式) example
 * @see more at: http://java2novice.com/spring/el-ternary-operator/#sthash.hVXNktts.dpuf
 * @author java2novice
 * @date 2015年12月3日下午4:05:06
 */
@Component("paymentGateway")
public class PaymentGateway {
	@Value("#{beanOrder.item}")
	private String itemName;
	@Value("#{beanOrder}")
	private Order order;
	@Value("#{beanOrder.taxPaid ? true : false}")
	private boolean canProcessOrder;

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

	public void processOrder() {
		if (canProcessOrder) {
			System.out.println("Processing order: " + order.getItem());
		} else {
			System.out.println("Please pay tax before ordering...");
		}
	}
}