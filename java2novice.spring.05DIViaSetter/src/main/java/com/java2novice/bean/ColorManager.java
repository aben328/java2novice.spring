package com.java2novice.bean;

/**
 * Here is ColorManager, we are using dependency injection via setter method in this class: - See more at:
 * http://java2novice.com/spring/dependency-injection-setter-method/#sthash.VDDop5Tv.dpuf
 */
public class ColorManager {
	MyColor color;

	public void pringColor() {
		this.color.printColor();
	}

	/**
	 * dependency injection through setter method
	 * @param myColor
	 */
	public void setMyColor(MyColor myColor) {
		this.color = myColor;
	}
}
