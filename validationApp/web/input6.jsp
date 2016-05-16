<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/4/28
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入校验</title>
</head>
<body>

<s:form action="bookshow" method="POST">
    <s:textfield name="bookName" label="书名"/>
    <s:textfield name="author" label="作者"/>
    <s:textfield name="ISBN" label="书号"/>
    <s:textfield name="press" label="出版社"/>
    <s:textfield name="publicationDate" label="出版日期"/>
    <s:textfield name="price" label="价格"/>
    <s:textfield name="stockNum" label="库存数量"/>
    <s:submit/>
</s:form>

</body>
</html>
