<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/13
  Time: 22:30
  To change this template use File | Settings | File Templates.

  测试 ActionContext 访问 web 资源，显示界面是 show-action-context，action类是 TestActionContext 类
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>通过 ActionContext 获取 web 资源</title>
</head>
<body>

<a href="testActionContext.action?name=YLL">TestActionContext</a>
<br><br>
<%
    if (application.getAttribute("date") == null)
        application.setAttribute("date", new Date());
%>

<%-- 这是一个用户登录界面的链接 跳转页面是 Login_Ui.jsp --%>
<a href="login_ui">login</a>

</body>
</html>
