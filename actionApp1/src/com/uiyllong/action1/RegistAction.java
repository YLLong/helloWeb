package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionContext;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/21.
 */
public class RegistAction {
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

    public String Regist() {
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
