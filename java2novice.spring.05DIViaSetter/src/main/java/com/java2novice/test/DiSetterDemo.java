package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.bean.ColorManager;

/**
 * You can see spring bean configuration file below. We have two bean declarations. If you closely monitor property tag,
 * we are passing blueColor reference to myColor variable, which is setter method input parameter. The property tag
 * calls ColorManager.setMyColor() and passes the object reference of blueColor. Here is the dependency injection via
 * setter method demo class: 
 * 
 * @See more at:http://java2novice.com/spring/dependency-injection-setter-method/#sthash.VDDop5Tv.dpuf
 * @date 2015年12月2日上午10:14:38
 */
public class DiSetterDemo {

	public static void main(String a[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager clrManager = (ColorManager) context.getBean("colorManager");
		clrManager.pringColor();
	}
}
