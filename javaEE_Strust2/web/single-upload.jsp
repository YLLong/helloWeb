<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/25
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>单个文件上传页面</title>
</head>
<body>

<s:form action="single" method="POST" enctype="multipart/form-data">
    <s:file name="upload" label="上传文件"/>
    <s:submit value="上传"/>
</s:form>

</body>
</html>
