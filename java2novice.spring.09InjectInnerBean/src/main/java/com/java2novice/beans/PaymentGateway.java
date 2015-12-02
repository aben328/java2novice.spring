package com.java2novice.beans;

/**
 * Inner beans are the beans that are defined within the scope of another bean. Thus, a <bean/> element inside the
 * <property/> or <constructor-arg/> elements is called inner bean. (<bean class="com.java2novice.beans.Order">)This
 * page gives an example to inject inner bean in spring. This example uses constructor based injection, the approach is
 * similar for setter based injection. Here is a class called PaymentGateway, which requires Order object to be
 * injected. 
 * @See more at: http://java2novice.com/spring/inject-inner-bean/#sthash.xmuwwiuQ.dpuf
 * @author java2novice
 * @date 2015年12月2日上午11:29:24
 */
public class PaymentGateway {

	private Order order;

	public PaymentGateway(Order ord) {
		this.order = ord;
	}

	public void setOrder(Order ord) {
		this.order = ord;
	}

	public void processOrder() {
		System.out.println("Processing order: " + order.getItem());
	}
}
