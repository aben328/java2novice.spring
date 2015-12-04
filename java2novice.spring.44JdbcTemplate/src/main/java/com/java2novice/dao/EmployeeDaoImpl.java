package com.java2novice.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java2novice.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insertEmployee(Employee emp) {
		String query = "insert into employee (name,salary,dept) values (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] { emp.getName(), emp.getSalary(), emp.getDept() };
		jdbcTemplate.update(query, inputs);
	}
}
