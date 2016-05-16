<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/27
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数组类型转化</title>
</head>
<body>

ISBN编码:<s:property value="isbn"/>
<br><br>

<s:iterator value="isbn" id="ib">
    国家和语言:<s:property value="#ib.country_language"/><br>
    出版社:<s:property value="#ib.press"/><br>
    书序码:<s:property value="#ib.bookID"/><br>
    校验码:<s:property value="#ib.checkCode"/><br><br>
</s:iterator>

</body>
</html>
