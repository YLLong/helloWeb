package com.uiyllong.actions;

import com.uiyllong.dao.Emp_Dao;
import org.apache.struts2.interceptor.RequestAware;

import java.util.List;
import java.util.Map;

/**
 * Created by uilong on 2016/4/20.
 */
public class Employee implements RequestAware {
    private Map<String, Object> requestMap = null;
    private Emp_Dao dao = new Emp_Dao();

    private String username;
    private String password;
    private String gender;
    private String department;
    private List<String> roles;
    private String desc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String save() {
        System.out.println(this);
        return "save";
    }

    public String input() {
        requestMap.put("departments", dao.getDepartments());
        requestMap.put("roles", dao.getRoles());
        return "input";
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.requestMap = request;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", roles=" + roles +
                ", desc='" + desc + '\'' +
                '}';
    }
}
