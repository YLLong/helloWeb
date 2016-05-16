<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/13
  Time: 9:53
  To change this template use File | Settings | File Templates.

  这是图书馆管理系统欢迎界面，登录界面是 login.jsp
  响应 action 是 com.uiyllong.actions.LoginAction
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>欢迎使用图书馆管理系统-欢迎界面</title>
</head>
<body>

<s:set name="login" value="#session['login']"/>
<s:property value="#login.name"/>, 你好！欢迎你使用图书馆管理系统。

</body>
</html>
