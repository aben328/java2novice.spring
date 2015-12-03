
package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * And in the below bean we are using @Autowired annotation, now which bean will be assigned? In this case an exception
 * will be thrown:
 * @see more at: http://java2novice.com/spring/qualifier-annotation/#sthash.BWgdGa5J.dpuf
 * @author java2novice
 * @date 2015年12月3日下午5:58:19
 */
public class PaymentGateway {
	@Autowired
	private Order order;

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}
