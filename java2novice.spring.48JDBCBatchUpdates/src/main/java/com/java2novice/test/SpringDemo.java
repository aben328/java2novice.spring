package com.java2novice.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.dao.EmployeeDao;
import com.java2novice.model.Employee;

/**
 * You have seen coupld of Spring JDBC examples using JdbcTemplate in the previous examples. <br>
 * This page gives you an example on batch updates using spring JdbcTemplate.<br>
 * @see more at: http://java2novice.com/spring/jdbctemplate-batch-update/#sthash.WSnNQqiB.dpuf
 * @author java2novice
 * @date 2015年12月4日下午2:30:22
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
		List<Employee> inputs = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setName("John");
		e1.setSalary(5000);
		e1.setDept("Accounts");
		inputs.add(e1);
		Employee e2 = new Employee();
		e2.setName("Amar");
		e2.setSalary(15000);
		e2.setDept("Engineering");
		inputs.add(e2);
		empDao.insertEmployeeRecoreds(inputs);
	}
}
