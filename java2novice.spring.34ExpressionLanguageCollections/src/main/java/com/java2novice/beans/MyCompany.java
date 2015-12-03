package com.java2novice.beans;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component("myCompanyBean")
public class MyCompany {
 
    private List<Employee> empList;
    private Map<String, Integer> empIdMap;
     
    @Value("#{myCompanyBean.empList[0]}")
    private Employee firstEmployee;
     
    @Value("#{myCompanyBean.empIdMap['Nataraja Gootooru']}")
    private int starEmpId;
     
    public MyCompany(){
        //populate list
        empList = new ArrayList<Employee>();
        empList.add(new Employee(1016, "Nataraja Gootooru"));
        empList.add(new Employee(1015, "Nagesh Yenamala"));
        empList.add(new Employee(1017, "Nikesh Penumalli"));
        //populate map
        empIdMap = new HashMap<String, Integer>();
        empIdMap.put("Nataraja Gootooru", 1016);
        empIdMap.put("Nagesh Yenamala", 1015);
        empIdMap.put("Nikesh Penumalli", 1017);
    }
 
    public void printEmpInfo(){
        System.out.println(this.firstEmployee.toString());
        System.out.println("Star employee id: "+this.starEmpId);
    }
     
    public List<Employee> getEmpList() {
        return empList;
    }
 
    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
 
    public Map<String, Integer> getEmpIdMap() {
        return empIdMap;
    }
 
    public void setEmpIdMap(Map<String, Integer> empIdMap) {
        this.empIdMap = empIdMap;
    }
 
    public Employee getFirstEmployee() {
        return firstEmployee;
    }
 
    public void setFirstEmployee(Employee firstEmployee) {
        this.firstEmployee = firstEmployee;
    }
 
    public int getStarEmpId() {
        return starEmpId;
    }
 
    public void setStarEmpId(int starEmpId) {
        this.starEmpId = starEmpId;
    }
}