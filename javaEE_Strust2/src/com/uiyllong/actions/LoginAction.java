package com.uiyllong.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.uiyllong.bean.Login;
import com.uiyllong.dao.LoginDao;

import java.util.Map;

/**
 * Created by uilong on 2016/4/13.
 */
public class LoginAction extends ActionSupport {
    private Login login;
    public String execute() throws Exception {
        LoginDao loginDao = new LoginDao();
        Login login1 = loginDao.checkLogin(login.getName(), login.getPassword());
        if (login1 != null) {
            Map session = ActionContext.getContext().getSession();
            session.put("login", login1);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
