package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.EmployeeDao;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
		String empName = empDao.findEmployeeName(3);
		System.out.println("Employee name: " + empName);
		System.out.println("-----------------------------------------------");
		int maxSal = empDao.findMaxSalary();
		System.out.println("Max salary: " + maxSal);
	}
}
