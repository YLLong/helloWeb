package com.uiyllong.actions;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by uilong on 2016/4/16.
 */
public class UserAction implements SessionAware, ApplicationAware {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String logout() {
        //获取当前在线人数
        Integer count = (Integer) application.get("count");
        if (count != null && count >0 ) {
            //在线人数 -1
            count--;
            application.put("count", count);
        }
        //使 session 失效：强转为 SessionMap， 调用 invalidate 方法
        ((SessionMap)session).invalidate();
        return "logout_success";
    }

    public String execute() {

        //把用户信息存入 Session 域中
        //1、获取 session ，通过实现 sessionAware 借口 (下面的 setSession 方法和 setAppliction 方法就是实现接口)

        //2、获取登录信息：通过在 Action 中添加 setter 方法 (上面属性的 setter 方法就是获取登录信息了)

        //3、把用户信息存入到 session 中
        session.put("username", username);
        session.put("password", password);

        // 在线人数 +1
        //1、获取当前在线人数，从 application 中获取
        Integer count = (Integer) application.get("count");
        if (count == null) {
            count = 0;
        }
        //2、使当前在线人数 +1
        count++;
        application.put("count", count);
        return "login_success";
    }

    private Map<String, Object> session;

    /**
     * sessionaware 接口的实现
     * @param session
     */
    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    private Map<String, Object> application;

    /**
     * applicationaware 接口的实现
     * @param application
     */
    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }
}
