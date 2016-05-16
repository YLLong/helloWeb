package com.uiyllong.tagsapp.action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Calendar;
import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/26.
 */
public class TagsAction {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String tag() {
        ActionContext ac = ActionContext.getContext();
        Map application = ac.getApplication();
        String str = (String) application.get("birthday");
        String[] strq = str.split("-");
        int b = Integer.parseInt(strq[0]);
        Calendar calendar = Calendar.getInstance();
        int a = calendar.get(Calendar.YEAR);
        age = a - b;
        System.out.println(age);
        return SUCCESS;
    }
}
