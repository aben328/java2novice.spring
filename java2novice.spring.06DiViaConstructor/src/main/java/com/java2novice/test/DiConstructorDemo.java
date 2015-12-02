package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.bean.ColorManager;

/**
 * Here is the dependency injection via constructor demo class:
 */
public class DiConstructorDemo {

	public static void main(String a[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ColorManager clrManager = (ColorManager) context.getBean("colorManager");
		clrManager.pringColor();
	}
}
