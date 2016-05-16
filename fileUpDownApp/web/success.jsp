<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示上传结果</title>
</head>
<body>

用户名:<s:property value="username"/>
<br><br>

头像:<img src="uploadfile/<s:property value='filesFileName[0]'/>"/>
<br><br>

<a href="uploadfile/个人简介.doc">个人简历</a>

</body>
</html>
