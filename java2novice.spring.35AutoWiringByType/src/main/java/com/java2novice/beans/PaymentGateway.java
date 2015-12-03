package com.java2novice.beans;

/**
 * If you specify auto-wiring by type, then the injection will be based on data type of the bean and should be
 * compatible with assigning bean property data type. <br>
 * <br>
 * In spring, auto-wiring by type allows a property to be autowired if there is exactly one bean of the property type in
 * the container. If there is more than one, a fatal exception is thrown, and this indicates that you may not use byType
 * autowiring for that bean. If there are no matching beans, nothing happens; the property is not set. If this is not
 * desirable, setting the dependency-check= "objects" attribute value specifies that an error should be thrown in this
 * case. <br>
 * <br>
 * @see more at: http://java2novice.com/spring/auto-wiring-bytype/#sthash.Fsy1hXpb.dpuf
 * @author java2novice
 * @date 2015年12月3日下午5:08:15
 */
public class PaymentGateway {
	private Order order;

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