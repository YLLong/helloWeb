<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/22
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息展示及添加</title>
</head>
<body>

添加信息:<br><br>

<s:form action="emp-save">
    <s:textfield name="firstName" label="FirstName"/>
    <s:textfield name="lastName" label="LastName"/>
    <s:textfield name="email" label="Email"/>
    <s:submit value="添加"/>
</s:form>

<br><hr><br>

<table cellpadding="10" cellspacing="0" border="1">
    <thead>
    <tr>
        <td>EmployeeId</td>
        <td>FirstName</td>
        <td>LastName</td>
        <td>Email</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    </thead>

    <tbody>
    <s:iterator value="#request.emps">
        <tr>
            <td>${empId}</td>
            <td>${firstName}</td>
            <td>${lastName}</td>
            <td>${email}</td>
            <td><a href="emp-edit?empId=${empId}">edit</a></td>
            <td><a href="emp-delete?empId=${empId}">delete</a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>

</body>
</html>
