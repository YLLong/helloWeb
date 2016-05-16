<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/16
  Time: 10:50
  To change this template use File | Settings | File Templates.

  这是login_ui 登录成功的跳转页面
  响应 action 是 useraction
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎你登录成功</title>
</head>
<body>

username: ${sessionScope.username }
<br><br>
在线人数: ${applicationScope.count }
<br><br>
<a href="logout">Logout</a>

</body>
</html>
