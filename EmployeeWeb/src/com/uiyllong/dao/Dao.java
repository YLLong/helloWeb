package com.uiyllong.dao;

import com.uiyllong.javabean.Employee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by uilong on 2016/4/22.
 */
public class Dao {

    private static Map<Integer, Employee> emps = new LinkedHashMap<Integer, Employee>();

    static {
        emps.put(1001, new Employee(1001, "AA", "aa", "aa@uiyllong.com"));
        emps.put(1002, new Employee(1002, "BB", "bb", "bb@uiyllong.com"));
        emps.put(1003, new Employee(1003, "CC", "cc", "cc@uiyllong.com"));
        emps.put(1004, new Employee(1004, "DD", "dd", "dd@uiyllong.com"));
        emps.put(1005, new Employee(1005, "EE", "ee", "ee@uiyllong.com"));
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(emps.values());
    }

    public void delete(Integer empId) {
        emps.remove(empId);
    }

    public void save(Employee emp) {
        long time = System.currentTimeMillis();
        emp.setEmpId((int) time);
        emps.put(emp.getEmpId(), emp);
    }

    public Employee get(Integer empId) {
        return emps.get(empId);
    }

    public void update(Employee emp) {
        emps.put(emp.getEmpId(), emp);
    }
}
