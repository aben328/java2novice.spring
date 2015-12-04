package com.java2novice.dao;

import com.java2novice.model.Employee;

/**
 * Employee DAO implementation class: Note that below class extended JdbcDaoSupport,
 *  and didnot use JdbcTemplate directly. - 
 *  See more at: http://java2novice.com/spring/jdbcdaosupport-example/#sthash.v92b8Ruk.dpuf
 * <br><br><br>
 * @see http://blog.csdn.net/yangyz_love/article/details/8199207
 * @author java2novice
 * @date 2015年12月4日上午10:24:38
 */
public interface EmployeeDao {

	public void insertEmployee(Employee emp);
}
