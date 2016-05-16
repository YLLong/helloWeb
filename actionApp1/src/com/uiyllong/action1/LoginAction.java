package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionContext;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/20.
 */
public class LoginAction {
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

    public String Login() {
        ActionContext ac = ActionContext.getContext();
        if (("鄢淋珑").equals(username) && ("106601").equals(password)) {
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
            ac.getApplication().put("msg", "登录失败！用户名或者密码错误！");
            return ERROR;
        }
    }
}
