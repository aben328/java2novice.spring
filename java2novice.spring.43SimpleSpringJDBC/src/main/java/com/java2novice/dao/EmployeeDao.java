package com.java2novice.dao;

import com.java2novice.model.Employee;

public interface EmployeeDao {

	public Employee findEmployeeById(int empId);
}
