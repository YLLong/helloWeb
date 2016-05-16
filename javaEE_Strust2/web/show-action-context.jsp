<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/13
  Time: 22:43
  To change this template use File | Settings | File Templates.

 是 test_action_context的跳转页面
 响应action是TestActionContext
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示web的信息</title>
</head>
<body>

<h4>ActionContextInfo</h4>
Appliction: ${applicationScope.applicationKey }<br>
Session: ${sessionScope.sessionKey }<br>
Request: ${requestScope.requestKey }<br>
parameters: ${param.name }

</body>
</html>
