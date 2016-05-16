package com.uiyllong.action1;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.uiyllong.dao.Dao;
import com.uiyllong.javabean.Employee;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by uilong on 2016/4/22.
 */
public class EmployeeAction implements RequestAware, ModelDriven<Employee>, Preparable{
    private Dao dao = new Dao();

    private Employee employee;

    //需要在当前的 employeeAction 中定义 empId 属性
    //以接受请求参数
    private Integer empId;

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String update() {
        dao.update(employee);
        return SUCCESS;
    }

    public void prepareUpdate() {
        employee = new Employee();
    }

    public String edit() {
        //1、获取传入的 emplId: employee.getEmpId;
//        Employee emp = dao.get(empId);
//        employee.setFirstName(emp.getFirstName());
//        employee.setLastName(emp.getLastName());
//        employee.setEmail(emp.getEmail());
        return "edit";
    }

    public void prepareEdit() {
        employee = dao.get(empId);
    }

    public String delete() {
        dao.delete(empId);
        //返回结果的类型应为：redirectAction
        //也可以是 chain:实际上没有必要用 chain，因为不需要在下一个 action保留当前 action 的状态
        //若使用 chain，则到达目标页面后，地址栏显示的依然是删除的那个连接，刷新时会有重复提交。
        return SUCCESS;
    }

    public String save() {
        dao.save(employee);
        return SUCCESS;
    }

    public void prepareSave() {
        employee = new Employee();
    }

    public String list() {
        request.put("emps", dao.getEmployees());
        return "list";
    }

    private Map<String, Object> request;
    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public Employee getModel() {
        return employee;
    }

    @Override
    public void prepare() throws Exception {

    }
}
