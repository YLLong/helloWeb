<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <title>文件下载页面</title>
</head>
<body>

<s:form action="download" method="POST">
    <s:set name="majorList" value="{'网络工程', '软件工程', '计算机工程', '数媒'}"/>
    <s:select list="majorList" name="majorName" headerKey="" headerValue="选择专业" label="请选择专业"/>
    <s:select list="{'13级', '14级', '15级', '16级'}" name="grade" label="请选择年级" headerKey="" headerValue="选择年级"/>
    <s:submit value="下载"/>
</s:form>

</body>
</html>
