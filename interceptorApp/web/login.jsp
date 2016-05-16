<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/30
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实现Struts2自定义拦截器</title>
</head>
<body>

<s:debug/>
<s:property value="msg"/>
<s:form action="login" method="POST">
    <s:textfield name="username" label="用户名"/>
    <s:password name="password" label="密码"/>
    <s:submit/>
</s:form>

</body>
</html>
