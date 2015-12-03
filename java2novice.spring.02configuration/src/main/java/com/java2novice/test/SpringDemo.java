package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java2novice.bean.MyColor;
import com.java2novice.config.MyAppConfig;

/**
 * Here is the demo class:
 */
public class SpringDemo {

	@SuppressWarnings("resource")
	public static void main(String a[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyColor color = (MyColor) context.getBean("myColorBean");
		color.printColor();
	}
}

// See more at: http://java2novice.com/spring/spring-java-based-configuration/