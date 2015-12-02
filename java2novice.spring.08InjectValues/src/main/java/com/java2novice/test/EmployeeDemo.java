package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.bean.Employee;

/**
 * We can inject values into spring bean from spring bean configuration file itself. It is very simple. This page shows
 * how to populate values to spring bean instance variables. Here we have Employee class, which has three fields called
 * name, role, employee id:
 */
public class EmployeeDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employeeBean = (Employee) context.getBean("employeeBean");
		System.err.println(employeeBean);
	}
}
