package com.java2novice.bean;

/**
 * We can inject values into spring bean from spring bean configuration file itself. It is very simple. This page shows
 * how to populate values to spring bean instance variables. Here we have Employee class, which has three fields called
 * name, role, employee id:
 */
public class Employee {

	private int empId;
	private String name;
	private String role;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", role=" + role + "]";
	}

}
