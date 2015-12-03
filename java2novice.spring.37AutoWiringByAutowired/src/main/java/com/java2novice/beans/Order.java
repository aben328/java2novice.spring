package com.java2novice.beans;

/**
 * You have seen multiple ways of injecting beans using different auto-wiring modes on xml based configuration file.
 * Spring also provides annotation based auto-wiring by providing @Autowired annotation. you can use @Autowired
 * annotation to auto wire spring bean on setter method, instance variable, and constructor. If you use @Autowired
 * annotation, spring container auto-wires the bean by matching data type. <br>
 * <br>
 * This page shows an example for how to use @Autowired annotation on setter method, instance variable and constructor.
 * Here is the simple spring bean:
 */
public class Order {

	private String item;

	private String price;

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
}
