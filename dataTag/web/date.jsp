<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>date 标签</title>
</head>
<body>
<%-- Calendar 中用 set() 来设置时间，用 getTime() 函数来得到设置的时间，如果没有设置时间，则得到当前系统时间 --%>
<%
    Calendar calendar = Calendar.getInstance();
    calendar.set(2014, 7, 16, 20, 54);
    Date bir = calendar.getTime();
    request.setAttribute("bir", bir);
%>

<s:date name="#request.bir" format="yyyy-MM-dd HH:mm" nice="false"/><br>
<s:date name="#request.bir" format="yyyy-MM-dd" nice="true"/><br>
<s:date name="#request.bir" nice="false"/><br>
<s:date name="#request.bir" nice="true"/>

</body>
</html>
