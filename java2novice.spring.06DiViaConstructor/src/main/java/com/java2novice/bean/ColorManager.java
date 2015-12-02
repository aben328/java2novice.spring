package com.java2novice.bean;

/**
 * Here is ColorManager, we are using [dependency injection via construtor] in this class: - See more at:
 * http://java2novice.com/spring/dependency-injection-constructor/#sthash.QnyoUHKQ.dpuf
 */
public class ColorManager {

	MyColor color;

	public void pringColor() {
		this.color.printColor();
	}

	/**
	 * dependency injection through constructor
	 * @param myColor
	 */
	public ColorManager(MyColor myColor) {
		this.color = myColor;
	}
}
