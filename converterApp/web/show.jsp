<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/27
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出类型转换后的ISBN编码</title>
</head>
<body>

ISBN编码:<s:property value="isbn"/>
<br><br>
国家和语言:<s:property value="isbn.country_language"/><br>
出版社:<s:property value="isbn.press"/><br>
书序码:<s:property value="isbn.bookID"/><br>
校验码:<s:property value="isbn.checkCode"/>

</body>
</html>
