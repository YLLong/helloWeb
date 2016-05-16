<%@ page import="java.util.List" %>
<%@ page import="com.uiyllong.bean.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/20
  Time: 17:35
  To change this template use File | Settings | File Templates.

  这是测试表单标签的页面，响应 action 是 Form_tag_User，然后回显.
  回显得时候密码不会回显，加上 showpassword="true" 就会显示密码.
  用上了一个Javabean 测试 chechbox 标签

   回显是去栈顶找对象中去找属性，如果没有属性，再依次往下找属性
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单测试页面</title>
</head>
<body>

<s:debug/>

<%
    List<City> cities = new ArrayList<City>();
    cities.add(new City(100, "AA"));
    cities.add(new City(101, "BB"));
    cities.add(new City(102, "CC"));
    cities.add(new City(103, "DD"));
    request.setAttribute("cities", cities);
%>

<br><br>

<s:form action="save">
    <s:hidden name="id"/>
    <s:textfield name="username" label="UserName"/>
    <s:password name="password" label="Password"/>
    <s:textarea name="desc" label="Desc"/>
    <s:checkbox name="married" label="married"/>
    <s:radio list="# {'1':'男', '0':'女'}" label="gender" name="gender"/>
    <%--
        action 处理时要使用集合类型 list<string> 来处理还能回显
    --%>
    <s:checkboxlist list="# request.cities" label="City" name="city"
                    listKey="cid" listValue="cname"/>

    <s:select list="{12, 13, 14, 15, 16}" label="Age" name="age"
    headerKey="" headerValue="请选择">
        <%--
            s: optgroup 可以作 s：select 的子标签，用于显示更多的下拉框
            注意：必须是键值对，不能使用集合{12,12,12}这种键与值同一个数的
        --%>
        <s:optgroup label="20-30" list="# {21:21, 22:23}"/>
    </s:select>
    <s:submit/>
</s:form>

</body>
</html>
