package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.Employee;

/**
 * This example shows how to inject date into spring bean property:
 * @see more at: http://java2novice.com/spring/inject-date-bean-property/#sthash.FhzwigGc.dpuf
 * @author java2novice
 * @date 2015年12月2日下午7:59:36
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		Employee myEmp = (Employee) context.getBean("myEmployee");
		myEmp.testMe();
	}
}
