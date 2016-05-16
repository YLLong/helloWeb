<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/4
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sort 标签</title>
</head>
<body>

<S:bean name="com.uiyllong.dataTag.action.TestComparator" id="t"/>
<S:sort comparator="t" source="{'java', 'c', 'php', 'ajax'}" id="sort"/>
<s:iterator value="#attr.sort">
    <S:property/>
</s:iterator>

</body>
</html>
