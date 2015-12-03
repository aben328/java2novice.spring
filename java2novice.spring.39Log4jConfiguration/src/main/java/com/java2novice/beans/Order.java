package com.java2novice.beans;

/**
 * Previous page shows an example for auto-wiring using @Autowired annotation. What if a same bean declared twice? Which
 * bean will be auto-wired? <br>
 * <br>
 * Lets walk through the scenario: <br>
 * <br>
 * - See more at: http://java2novice.com/spring/logging-with-log4j/
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
