<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>if_elseif 标签</title>
</head>
<body>

<S:bean name="com.uiyllong.dataTag.bean.Student" id="st">
    <s:param name="name">javaee</s:param>
    <s:if test="name=='javaee'">
        Javaee
    </s:if>
    <s:elseif test="false">
        c00;
    </s:elseif>
    <s:else>
        JavaEE 实用教程
    </s:else>
</S:bean>

</body>
</html>
