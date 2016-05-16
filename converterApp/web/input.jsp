<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/27
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Struts2类型转换练习</title>
</head>
<body>

<s:form action="converter" method="POST">
    <s:textfield name="isbn" label="输入一个ISBN编码"/>
    <s:submit/>
</s:form>

</body>
</html>
