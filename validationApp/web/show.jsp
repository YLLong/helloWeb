<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/28
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户输入的图书的所有信息</title>
</head>
<body>

书名:<s:property value="bookName"/>
<br><br>
作者:<s:property value="author"/>
<br><br>
书号ISBN:<s:property value="ISBN"/>
<br><br>
出版社:<s:property value="press"/>
<br><br>
出版日期:<s:property value="publicationDate"/>
<br><br>
价格:<s:property value="price"/>
<br><br>
库存数量:<s:property value="stockNum"/>


</body>
</html>
