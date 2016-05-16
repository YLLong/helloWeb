<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/20
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>actionApp1 的登录页面</title>
</head>
<body>

<s:form action="" name="form">
    <s:textfield label="用户名" name="username"/><br>
    <s:password label="密码" name="password"/><br>
    <s:submit  value="登录" onclick="form.action='Login'; form.submit();"/>
    <s:submit value="注册" onclick="form.action='Regist'; form.submit();"/>
</s:form>

</body>
</html>
