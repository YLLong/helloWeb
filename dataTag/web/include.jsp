<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include 标签</title>
</head>
<body>

不带参数的导入:<br>
<s:include value="includer.jsp"/>
<br><br>

带参数的导入：<br>
<s:include value="includer.jsp">
    <s:param name="java" value="'JavaEE 实用教程'"/>
</s:include>

</body>
</html>
