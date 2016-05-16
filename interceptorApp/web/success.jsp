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
    <title>用户登录成功的信息</title>
</head>
<body>

<h4>用户信息</h4>
<br><br>

<s:debug/>
<br><br>

用户名:<s:property value="username"/><br>
密码:<s:property value="password"/>

</body>
</html>
