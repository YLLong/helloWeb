<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>subset2 标签</title>
</head>
<body>

<s:bean name="com.uiyllong.dataTag.action.TestDecider" id="td"/>
<s:subset id="books" source="{'ajax', 'c++', 'c', 'c#', 'java'}" decider="td"/>
<s:iterator value="#attr.books">
    <s:property/>
</s:iterator>

</body>
</html>
