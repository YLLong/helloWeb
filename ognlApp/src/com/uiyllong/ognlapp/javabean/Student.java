package com.uiyllong.ognlapp.javabean;

/**
 * Created by uilong on 2016/4/25.
 */
public class Student {
    private String stuId;
    private String stuName;
    private String gender;
    private Integer age;
    private String stuNative;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStuNative() {
        return stuNative;
    }

    public void setStuNative(String stuNative) {
        this.stuNative = stuNative;
    }

    public Student(String stuId, String stuName, String gender, Integer age, String stuNative) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.age = age;
        this.stuNative = stuNative;
    }

    public Student() {
    }
}
