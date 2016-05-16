<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>url 标签</title>
</head>
<body>

<s:url value="success.jsp"/><br>

<s:url value="success.jsp" id="jsp"/><br>

<s:property value="%{jsp}"/><br>

<s:url value="action.action"/><br>

<s:url action="action"/><br>

<s:url action="action" method="execute"></s:url><br>

<s:url action="action">
    <s:param name="bookName" value="'java'"></s:param>
</s:url><br>

<s:url action="action" namespace="/"/><br>

<s:url action="action" value="Test1.action"></s:url>

</body>
</html>
