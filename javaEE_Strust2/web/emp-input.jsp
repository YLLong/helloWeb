<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/20
  Time: 21:28
  To change this template use File | Settings | File Templates.

    这个注册页面的入口是 index.jsp 上的链接进入；使用了 通配符进行配置
  这是一个用户注册模块，响应 action 是 employee action类，javabean 有 department 和 role 类
  dao 类用了 Emp_Dao 类做数据处理
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册模块</title>
</head>
<body>

<%
    request.setAttribute("theme", "xhtml");
%>

<s:form action="emp-save">

    <s:textfield label="Name" name="username"/>
    <s:password label="Password" name="password"/>
    <s:radio list="# {'1':'男', '0':'女'}" label="Gender" name="gender"/>
    <s:select list="#request.departments" listKey="departmentId" listValue="departmentName"
              label="Department" name="department"/>
    <s:checkboxlist list="#request.roles" listKey="roleId" listValue="roleName"
                    label="Role" name="roles"/>
    <s:textarea name="desc" label="Desc"/>
    <s:submit/>

</s:form>
</body>
</html>
