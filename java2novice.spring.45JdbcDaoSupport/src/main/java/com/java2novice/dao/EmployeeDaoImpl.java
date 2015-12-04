package com.java2novice.dao;
 
import org.springframework.jdbc.core.support.JdbcDaoSupport;
 
import com.java2novice.model.Employee;

/**
 * Previous example Spring JDBC example with JdbcTemplate shows how to use 
 * JdbcTemplate to make JDBC calls. You can make your JDBC calls even more 
 * simple by extending JdbcDaoSupport. 
 * 
 * If your DAO class extends JdbcDaoSupport, then you dont need to use 
 * JdbcTemplate in your code, here is the example for JdbcDaoSupport: 
 * @see more at: http://java2novice.com/spring/jdbcdaosupport-example/#sthash.v92b8Ruk.dpuf
 * @author java2novice
 *
 * @date 2015年12月4日下午2:06:47
 */
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
 
    @Override
    public void insertEmployee(Employee emp) {
        String query = "insert into employee (name,salary,dept) values (?,?,?)";
        Object[] inputs = new Object[] {emp.getName(), emp.getSalary(), emp.getDept()};
        getJdbcTemplate().update(query, inputs);
    }
}
