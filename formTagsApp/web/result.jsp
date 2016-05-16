<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/26
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示用户选择的城市</title>
</head>
<body>

用户选择的城市:<s:property value="province"/>---><s:property value="city"/>
<br>
用户选择的图书的作者:<s:property value="author"/>

</body>
</html>
