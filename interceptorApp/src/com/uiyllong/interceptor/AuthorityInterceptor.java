package com.uiyllong.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;

/**
 * Created by uilong on 2016/5/1.
 */
public class AuthorityInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext ac = actionInvocation.getInvocationContext();
        Map session = ac.getSession();
        String username = (String) session.get("username");
        String password = (String) session.get("password");
        if (username != null && username.equals("admin") && password != null && password.equals("admin")) {
            return actionInvocation.invoke();
        } else {
            ac.put("msg", "请使用admin用户名登录");
            return "login";
        }
    }
}
