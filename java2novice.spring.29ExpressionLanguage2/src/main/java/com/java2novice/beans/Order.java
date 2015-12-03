package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Using spring expression language, you can get any spring bean reference or its property using dot operator. Look at
 * below example.
 * @see more at: http://java2novice.com/spring/bean-reference-spring-el/#sthash.P2IEEzze.dpuf
 * @author java2novice
 * @date 2015年12月3日下午3:48:24
 */
@Component("beanOrder")
public class Order {

	@Value("Java Book")
	private String item;

	@Value("Rs 22.50")
	private String price;

	@Value("India")
	private String address;

	public String getDescription(String prefix) {
		return prefix + ": " + item + " | " + price + " | " + address;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
