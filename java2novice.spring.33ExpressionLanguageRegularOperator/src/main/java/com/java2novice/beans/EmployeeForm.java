package com.java2novice.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empFormBean")
public class EmployeeForm {

	private String nameRegEx = "^[a-zA-Z\\s]+$";

	@Value("Java2Novice")
	private String empName;

	@Value("#{empFormBean.empName matches empFormBean.nameRegEx}")
	private boolean empNameValid;

	@Value("25")
	private int age;

	@Value("#{empFormBean.age matches '[0-9]{2}' and empFormBean.age < 60}")
	private boolean validAge;

	public void printValidationResults() {

		StringBuilder sb = new StringBuilder();
		sb.append("empNameValid: ").append(empNameValid).append("\n");
		sb.append("validAge: ").append(validAge).append("\n");
		System.out.println(sb.toString());
	}

	public String getNameRegEx() {
		return nameRegEx;
	}

	public void setNameRegEx(String nameRegEx) {
		this.nameRegEx = nameRegEx;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isEmpNameValid() {
		return empNameValid;
	}

	public void setEmpNameValid(boolean empNameValid) {
		this.empNameValid = empNameValid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isValidAge() {
		return validAge;
	}

	public void setValidAge(boolean validAge) {
		this.validAge = validAge;
	}
}
