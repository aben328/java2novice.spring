package com.java2novice.test;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.java2novice.dao.EmployeeDao;
import com.java2novice.model.Employee;
 
public class SpringDemo {
	
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        @SuppressWarnings("resource")
		ConfigurableApplicationContext context =
                                    new ClassPathXmlApplicationContext(confFile);
        EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
        Employee emp = new Employee();
        emp.setName("Priya");
        emp.setSalary(60000);
        emp.setDept("HR");
        empDao.insertEmployee(emp);
    }
}
