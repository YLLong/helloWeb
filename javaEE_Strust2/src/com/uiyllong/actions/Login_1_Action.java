package com.uiyllong.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.uiyllong.bean.Animal;
import com.uiyllong.bean.UserLogin_1;

import java.util.Map;

/**
 * Created by uilong on 2016/4/13.
 */
public class Login_1_Action extends ActionSupport {

    private UserLogin_1 user;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public UserLogin_1 getUser() {
        return user;
    }

    public void setUser(UserLogin_1 user) {
        this.user = user;
    }

    public String login_1() {
        ActionContext ac= ActionContext.getContext();
        Map<String, Object> request = (Map<String, Object>) ac.get("request");
        request.put("username", "养老");
        if (("鄢淋珑").equals(user.getUsername()) && ("12").equals(user.getPassword())) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String regist() {
        int i = 5/0;
        System.out.print("你注册了该用户");
        return SUCCESS;
    }
}
