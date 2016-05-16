package com.uiyllong.fromtagsapp.action;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/27.
 */
public class FormTagsAction {
    private String province;
    private String city;
    private String author;

    public String tags() {
        return SUCCESS;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
