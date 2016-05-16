package com.uiyllong.ognlapp.action;

import com.uiyllong.ognlapp.javabean.Student;

import java.util.ArrayList;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/25.
 */
public class OgnlTestAction {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String execute() {
        students = new ArrayList<Student>();
        students.add(new Student("0901", "张弛", "男", 21, "北京"));
        students.add(new Student("0902", "李伟", "男", 20, "四川"));
        students.add(new Student("0903", "王可", "女", 18, "广东"));
        students.add(new Student("0904", "赵冰", "女", 19, "四川"));
        students.add(new Student("0905", "谢玫", "女", 21, "湖南"));
        students.add(new Student("0906", "胡新", "男", 19, "四川"));
        return SUCCESS;
    }
}
