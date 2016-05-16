<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/16
  Time: 10:07
  To change this template use File | Settings | File Templates.

  这是用户登录界面，是 test-action-context 中跳转过来，响应action是useraction
  跳转到 login_success.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录界面</title>
</head>
<body>

<form action="user_login" method="post">

    username: <input type="text" name="username"/><br>
    password: <input type="password" name="password"/><br>
    <input type="submit" value="Login"/>

</form>

</body>
</html>
