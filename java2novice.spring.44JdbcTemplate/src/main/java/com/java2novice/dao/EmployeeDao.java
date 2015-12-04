package com.java2novice.dao;

import com.java2novice.model.Employee;

/**
 * In the previous example Simple spring JDBC example we have seen very basic example to make JDBC calls. Spring
 * provides JdbcTemplate which simplifies JDBC calls much more.
 * <br><br><br>
 * @see http://blog.csdn.net/yangyz_love/article/details/8199207
 * @author java2novice
 * @date 2015年12月4日上午10:24:38
 */
public interface EmployeeDao {

	public void insertEmployee(Employee emp);
}
