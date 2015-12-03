package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
