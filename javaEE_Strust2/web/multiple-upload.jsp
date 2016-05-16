<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/25
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多个文件上传页面</title>
</head>
<body>

<s:form action="multiple" method="POST" enctype="multipart/form-data">
    <s:file name="upload1" label="文件上传1"/>
    <s:file name="upload1" label="文件上传2"/>
    <s:file name="upload1" label="文件上传3"/>
    <s:submit value="文件上传"/>
</s:form>

</body>
</html>
