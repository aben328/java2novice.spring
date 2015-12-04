package com.java2novice.test;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.EmployeeDao;
import com.java2novice.model.Employee;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
		Employee emp = empDao.findEmployeeById(3);
		System.out.println(emp.getName() + " | " + emp.getSalary() + " | " + emp.getDept());
		System.out.println("-----------------------------------------------");
		List<Employee> empList = empDao.findAllEmployees();
		for (Employee em : empList) {
			System.out.println(em.getName() + " | " + em.getSalary() + " | " + em.getDept());
		}
	}
}
