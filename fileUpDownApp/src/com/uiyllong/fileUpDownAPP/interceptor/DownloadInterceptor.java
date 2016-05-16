package com.uiyllong.fileUpDownAPP.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by uilong on 2016/5/14.
 */
public class DownloadInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext ac = actionInvocation.getInvocationContext();
        String username = (String) ac.getSession().get("username");
        if (username != null && username.length() > 0) {
            return actionInvocation.invoke();
        }
        return "upload";
    }
}
