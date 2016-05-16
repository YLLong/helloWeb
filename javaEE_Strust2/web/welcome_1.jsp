<%@ page import="java.lang.reflect.Parameter" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/13
  Time: 16:47
  To change this template use File | Settings | File Templates.

  这是上课小实验的跳转页面 index.jsp
  响应 action 是 Login_1_Action
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎界面</title>
</head>
<body>

恭喜 ${user.username}！你居然对了！
<br><br>

你的动物名字是:<s:property value="animal.name"/> --->种类是:<s:property value="animal.species"/>
<br><br>

你喜欢:
<%--这里 sports 是一个复选框的值，是一个数组，但是封装时，直接封装成字符串,这里直接可以获取--%>
${user.sports}
<br><br>

你学习:
${user.languages}

</body>
</html>
