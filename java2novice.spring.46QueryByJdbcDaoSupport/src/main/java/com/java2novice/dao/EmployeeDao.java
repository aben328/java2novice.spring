package com.java2novice.dao;

import java.util.List;

import com.java2novice.model.Employee;
/**
 * Employee DAO interface:
 * 
 * @author java2novice
 *
 * @date 2015年12月4日下午2:11:57
 */
public interface EmployeeDao {

	public Employee findEmployeeById(int empId);

	public List<Employee> findAllEmployees();
}
