<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/22
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息修改</title>
</head>
<body>

修改信息：<br><br>

<s:form action="emp-update">
    <s:hidden name="empId"/>
    <s:textfield name="firstName" label="FirstName"/>
    <s:textfield name="lastName" label="LastName"/>
    <s:textfield name="email" label="Email"/>
    <s:submit value="修改"/>
</s:form>

</body>
</html>
