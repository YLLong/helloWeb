package com.uiyllong.action1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by uilong on 2016/4/30.
 */
public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
//        ActionContext ac = ActionContext.getContext();
//        Map session = ac.getSession();
//
//        if ("admin".equals(username) && "admin".equals(password)) {
//            session.put("username", getUsername());
//            session.put("password", getPassword());
//            return SUCCESS;
//        } else {
//            if(session.get("username") == null || session.get("password") == null){
//                return INPUT;
//            } else
                return SUCCESS;
//        }
    }

    @Override
    public void validate() {
        ActionContext ac = ActionContext.getContext();
        Map session = ac.getSession();
        if ("admin".equals(username) && "admin".equals(password)) {
            session.put("username", getUsername());
            session.put("password", getPassword());
        }
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

}
