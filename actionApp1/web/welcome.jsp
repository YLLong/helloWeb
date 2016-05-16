<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/20
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>actionApp1 欢迎页面</title>
</head>
<body>

欢迎你：<s:property value="username"/>
<br><br>
服务器处理结果：${applicationScope.msg}
<br><br>

服务器访问次数：${applicationScope.count}

</body>
</html>
