package com.java2novice.beans;

/**
 * @See more at:http://java2novice.com/spring/inject-inner-bean/#sthash.xmuwwiuQ.dpuf
 * @author java2novice
 * @date 2015年12月2日上午11:28:48
 */
public class Order {

	private String item;
	private String price;
	private String address;

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
