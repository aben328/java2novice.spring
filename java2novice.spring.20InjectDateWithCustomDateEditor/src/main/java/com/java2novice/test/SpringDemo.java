package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.Employee;

/**
 * Here is the spring bean demo class:
 * @see http://www.cnblogs.com/chenying99/archive/2013/02/24/2927253.html
 * @author java2novice
 * @date 2015年12月2日下午8:05:51
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
