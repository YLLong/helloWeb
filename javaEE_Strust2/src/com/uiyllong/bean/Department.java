package com.uiyllong.bean;

/**
 * Created by uilong on 2016/4/20.
 */
public class Department {
    private Integer departmentId;
    private String departmentName;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(Integer departmentId, String departmentName) {
        super();
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department() {
    }
}
