package com.java2novice.beans;

/**
 * Spring auto-wiring mode constructor <br>
 * <br>
 * Auto-wiring by constructor is similar to byType, but it applies to constructor arguments. If there isn't exactly one
 * bean of the constructor argument type in the container, a fatal error is raised. <br>
 * <br>
 * - See more at: http://java2novice.com/spring/auto-wiring-constructor/#sthash.GK74UqIj.dpuf
 * @author java2novice
 * @date 2015年12月3日下午5:08:15
 */
public class PaymentGateway {

	private Order order;

//	Auto-wiring by constructor
	public PaymentGateway(Order ord) {
		this.order = ord;
	}

	public void setOrder(Order ord) {
		this.order = ord;
	}

	public Order getOrder() {
		return order;
	}

	@Override
	public String toString() {
		return "ordering " + this.order.getItem() + " | price: " + this.order.getPrice();
	}
}
