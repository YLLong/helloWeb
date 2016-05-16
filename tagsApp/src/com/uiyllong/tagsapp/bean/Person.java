package com.uiyllong.tagsapp.bean;

import java.util.Date;

/**
 * Created by uilong on 2016/4/26.
 */
public class Person {
    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person() {
    }
}
