package com.uiyllong.bean;

/**
 * 是 form-tag.jsp 的测试类
 * 这是一个测试 checkbokxlist 的一个 Javabean 类
 * Created by uilong on 2016/4/20.
 */
public class City {
    private Integer cid;
    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public City(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public City() {
    }
}
