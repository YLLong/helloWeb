package com.uiyllong.actionApp2.action;

import com.opensymphony.xwork2.ActionContext;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/25.
 */
public class LoginRegistAction {
    private String username;
    private String password;

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

    public String login() {
        ActionContext ac = ActionContext.getContext();
        if (("鄢淋珑").equals(username) && ("106601").equals(password)) {
            ac.getApplication().put("username", username);
            Integer count = (Integer) ac.getApplication().get("count");
            if (count == null) {
                count = 1;
            } else {
                count ++;
            }
            ac.getApplication().put("msg", "登录成功！");
            ac.getApplication().put("count", count);
            return SUCCESS;
        } else {
            ac.getApplication().put("msg", "登录失败！用户名或密码错误！");
            return ERROR;
        }
    }

    public String regist() {
        ActionContext ac = ActionContext.getContext();
        Integer count = (Integer) ac.getApplication().get("count");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        ac.getApplication().put("msg", "注册成功！");
        ac.getApplication().put("count", count);
        return SUCCESS;
    }
}
