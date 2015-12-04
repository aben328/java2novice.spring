package com.java2novice.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Employee DAO implementation class: Note that below class extended JdbcDaoSupport, and didnot use JdbcTemplate
 * directly. Note carefully, below class comes with two methods, in which one method maps the column type, another
 * method uses JdbcTemplate specific type method:
 * @see more at: http://java2novice.com/spring/jdbctemplate-single-query/#sthash.r752yN8r.dpuf
 * @author java2novice
 * @date 2015年12月4日下午2:18:20
 */
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public String findEmployeeName(int empId) {
		String query = "select name from employee where empId=?";
		Object[] inputs = new Object[] { empId };
		String empName = getJdbcTemplate().queryForObject(query, inputs, String.class);
		return empName;
	}

	@Override
	public int findMaxSalary() {
		String query = "select max(salary) from employee";
		@SuppressWarnings("deprecation")
		int maxSalary = getJdbcTemplate().queryForInt(query);
		return maxSalary;
	}
}