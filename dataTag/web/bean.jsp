<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bean 标签</title>
</head>
<body>

<s:bean name="com.uiyllong.dataTag.bean.Student" id="stu">
    <s:param name="name">鄢淋珑</s:param>
    <s:property value="name"/><br>

    <s:param name="name" value="'鄢淋珑'"></s:param>
    <s:property value="name"/>
</s:bean>
<br><br>

<s:property value="#stu.name"/>

</body>
</html>
