<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传页面</title>
</head>
<body>

<s:debug/>
<br><br>

<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:textfield name="username" label="用户名"/>
    <s:set name="majorList" value="{'网络工程', '软件工程', '计算机工程', '数媒'}"/>
    <s:select list="majorList" name="majorName" headerKey="" headerValue="选择专业" label="请选择专业"/>
    <s:select list="{'13级', '14级', '15级', '16级'}" name="grade" label="请选择年级" headerKey="" headerValue="选择年级"/>
    <s:file name="files" label="上传头像"/>
    <s:file name="files" label="上传个人简历"/>
    <s:fielderror/>
    <s:submit/>
</s:form>

</body>
</html>
