<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>subset 标签</title>
</head>
<body>

<s:subset id="books" source="{'ajax', 'c++', 'c', 'c#', 'java'}" start="1" count="3"/>
<s:iterator value="#attr.books">
    <s:property/>
</s:iterator>

</body>
</html>
