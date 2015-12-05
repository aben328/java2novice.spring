package com.java2novice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.java2novice.model.Employee;

/**
 * Employee DAO implementation class: Note that below class extended JdbcDaoSupport, and didnot use JdbcTemplate
 * directly. When using BeanPropertyRowMapper make sure that model properties matches with table column names. Also note
 * that the BeanPropertyRowMapper also maps database column names like emp_id to empId attribute in the class.
 * @see more at: http://java2novice.com/spring/jdbcdaosupport-query-example/#sthash.drtsKJmq.dpuf
 * @author java2novice
 * @date 2015年12月4日下午2:12:24
 */
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public Employee findEmployeeById(int empId) {
		Employee emp = null;
		String query = "select * from employee where empId=?";
		Object[] inputs = new Object[] { empId };
		emp = (Employee) getJdbcTemplate().queryForObject(query, inputs,
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return emp;
	}

	@Override
	public List<Employee> findAllEmployees() {

		List<Employee> empList = new ArrayList<Employee>();
		String query = "select * from employee";
		empList = getJdbcTemplate().query(query, new BeanPropertyRowMapper<Employee>(Employee.class));
		return empList;
	}
}
