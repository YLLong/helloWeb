<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>iterator 标签</title>
</head>
<body>

<table border="1">
<s:iterator value="{'java', 'c', 'c++', 'ajax'}" id="books" status="b">
    <tr <s:if test="#b.even">bgcolor="#CCCCFF"</s:if>
        <s:elseif test="#b.odd">bgcolor="EECCFF"</s:elseif>
    >
        <td><s:property value="books"/></td>
        <td><s:property value="#b.getIndex()"/></td>
        <td><s:property value="#b.getCount()"/></td>
    </tr>
</s:iterator>
</table>

</body>
</html>
