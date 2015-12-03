package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanOrder")
public class Order {
	@Value("Java Book")
	private String item;
	@Value("100")
	private String price;
	@Value("true")
	private boolean taxPaid;

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

	public boolean isTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(boolean taxPaid) {
		this.taxPaid = taxPaid;
	}
}