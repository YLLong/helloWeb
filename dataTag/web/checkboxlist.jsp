<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/5
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>checkboxlist 标签</title>
</head>
<body>

<s:form>
    <s:checkboxlist list="{'a', 's', 'd'}" label="用list生成的集合" name="ss" labelposition="top"/>
    <s:checkboxlist list="# {1:'a', 2:'s', 3:'d'}" label="用map生成的集合" listKey="key" listValue="value" name="ss" labelposition="top"/>
    <s:set name="list" value="{'a', 's', 'd'}"/>
    <s:checkboxlist list="#list" label="从别处拿的集合" name="ss" labelposition="top"/>
</s:form>

</body>
</html>
