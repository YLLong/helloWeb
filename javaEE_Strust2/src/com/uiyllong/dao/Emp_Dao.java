package com.uiyllong.dao;

import com.uiyllong.bean.Department;
import com.uiyllong.bean.Role;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uilong on 2016/4/20.
 */
public class Emp_Dao {

    public List<Department> getDepartments() {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(1001, "AA"));
        departments.add(new Department(1002, "BB"));
        departments.add(new Department(1003, "CC"));
        departments.add(new Department(1004, "DD"));
        departments.add(new Department(1005, "EE"));
        return departments;
    }

    public List<Role> getRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(new Role(1, "aa"));
        roles.add(new Role(2, "bb"));
        roles.add(new Role(3, "cc"));
        return roles;
    }

}
