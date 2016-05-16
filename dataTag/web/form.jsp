<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/5
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>普通 form 标签</title>
</head>
<body>

<s:form action="test" method="POST">
    <s:textfield name="username" label="用户名" value="请输入用户名" requiredLabel="true"/>
    <s:password name="password" label="密码" value="请输入密码" requiredLabel="true"/>
    <s:hidden value="hidden" name="hidden"/>
    <s:textarea name="con" value="内容" label="内容" disabled="true"/>
    <s:checkbox name="checkbok" label="篮球" value="true"/>
    <s:checkbox name="checkbok" value="false" label="足球"/>

    <s:select list="{'a', 's', 'd', 'f'}" label="请选择" name="select">
        <s:optgroup label="a-c" list="# {1:'a', 2:'b', 3:'c'}" listKey="key" listValue="value"/>
    </s:select>

    <s:file name="file" label="文件上传" accept="text/*"/>
    <s:submit/>
    <s:reset/>
</s:form>

</body>
</html>
