package com.uiyllong.actions;


import java.util.List;

/**
 * 这是表单标签的响应action ，请求响应是的 form-tag.jsp 页面
 * Created by uilong on 2016/4/20.
 */
public class Form_tag_User {
    private String id;
    private String username;
    private String password;
    private String desc;
    private String married;
    private String gender;
    private List<String> city;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String save() {
        System.out.println(this);
        Form_tag_User form_tag_user = new Form_tag_User();
        form_tag_user.setId("1001");
        form_tag_user.setUsername("jack");
        form_tag_user.setPassword("123456");
        form_tag_user.setDesc("javaEE");
        //将该对象放到栈顶
//        ActionContext.getContext().getValueStack().push(form_tag_user);

        return "success";
    }

    @Override
    public String toString() {
        return "Form_tag_User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", desc='" + desc + '\'' +
                ", married='" + married + '\'' +
                ", gender='" + gender + '\'' +
                ", city=" + city +
                ", age=" + age +
                '}';
    }
}
