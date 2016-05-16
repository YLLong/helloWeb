<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/13
  Time: 9:43
  To change this template use File | Settings | File Templates.

  这是图书馆系统的登陆界面，action 响应页面是 com.uiyllong.actions.LoginAction
  跳转欢迎界面是 welcome.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>图书馆管理系统-用户登录界面</title>
</head>
<body bgcolor="#71CABF">

<s:form action="login" method="post" theme="simple">
    <table>
        <caption>用户登录</caption>
        <tr>
            <td>登录名<s:textfield name="login.name" size="20"/></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码<s:password name="login.password" size="20"/></td>
        </tr>
        <tr>
            <td>
                <s:submit value="登录"/>
                <s:reset value="重置"/>
            </td>
        </tr>
    </table>
</s:form>

</body>
</html>
