package com.java2novice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.java2novice.model.Employee;

/**
 * Employee DAO implementation class: Note that below class extended JdbcDaoSupport, 
 * and didnot use JdbcTemplate
 * directly. We are calling batchUpdate() method on JdbcTemplate.
 * 
 * @See more at: http://java2novice.com/spring/jdbctemplate-batch-update/#sthash.WSnNQqiB.dpuf
 * @author java2novice
 * @date 2015年12月4日下午2:29:02
 */
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public void insertEmployeeRecoreds(List<Employee> emps) {

		String query = "insert into employee (name,salary,dept) values (?,?,?)";
		List<Object[]> inputList = new ArrayList<Object[]>();
		for (Employee emp : emps) {
			Object[] tmp = { emp.getName(), emp.getSalary(), emp.getDept() };
			inputList.add(tmp);
		}
		getJdbcTemplate().batchUpdate(query, inputList);
	}
}
