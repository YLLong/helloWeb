<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/5
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>combobox 标签</title>
</head>
<body>

<s:form>
    <s:combobox list="{'a', 's', 'd', 'f'}" name="combobox" label="请选择"/>
</s:form>

</body>
</html>
