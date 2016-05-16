package com.uiyllong.actions;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import java.util.Map;

/**
 * 这个 action 不能继承 actionsupport ,不然显示页面中的 applicationscope 等 无法获取键的值。
 * Created by uilong on 2016/4/13.
 */
public class TestActionContext {

    public String execute() throws Exception {

        //0. 获取 ActionContext 对象
        // ActionContext 是 Action 的上下文对象，可以从中获取当前 Action 需要的一切信息
        ActionContext actionContext = ActionContext.getContext();

        //1. 获取 application 对应的 Map，并向其中添加一个属性
        // 通过调用 ActionContext 对象的 getApplication() 方法来获取 application 对象的 Map 对象
        Map<String, Object> applicationMap = actionContext.getApplication();

        //设置属性
        applicationMap.put("applicationKey", "applictionValue");
        //获取属性
        Object date = applicationMap.get("date");
        System.out.println("date:" + date);

        //2. session
        // session 对应的 Map 实际上是 SessionMap 类型的! 强转后若调用其 invalidate() 方法, 可以使其 session 失效!
        //页面上将获取不到值
        Map<String, Object> sessionMap = actionContext.getSession();
        sessionMap.put("sessionKey", "sessionValue");

        //3. request*
        //ActionContext 中并没有提供 getRequest 方法来获取 request 对应的 Map
        //需要手工调用 get() 方法, 传入 request 字符串来获取.
        Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
        requestMap.put("requestKey", "requestValue");

        System.out.println(sessionMap.getClass());
        if (sessionMap instanceof SessionMap) {
            SessionMap sm = (SessionMap) sessionMap;
            sm.invalidate();                        // 如果不掉用这个一样可以获取值
            System.out.println("session 失效了，页面获取不到值了！");
        }

        //4. 获取请求参数对应的 Map，并获取指定的参数值。
        //键：请求参数的名字，值：请求参数的值对应的字符串数组
        // 注意：1.getParameters 的返回值为在 Map<String, Object>,而不是 Map<String, String[]>
        //      2. parameters 这个 Map 只能读，不能写入数据，如果写入不会出错，但是不能起作用。
        Map<String, Object> paramters = actionContext.getParameters();
        System.out.println(((String[])paramters.get("name"))[0]);

        return "success";
    }
}
