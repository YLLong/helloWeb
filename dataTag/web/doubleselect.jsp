<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/5
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<s:head/>
    <title>doubleselect 标签</title>
</head>
<body>

<s:form action="action">
    <s:set name="list" value="# {'a':{'aa', 'bb'}, 'b':{'bb','cc'}}"/>
    <s:doubleselect doubleList="#list[top]" doubleName="dn" list="#list.keySet()" name="n" label="请选择地方"/>
    
    <s:updownselect list="{'a', 'b', 'c'}" name="n" moveUpLabel="上移" moveDownLabel="下移" selectAllLabel="全选"/>

    <s:optiontransferselect doubleList="{'a', 'b', 'c'}" doubleName="abc" list="{'A', 'B', 'C'}" name="lis"
                            leftTitle="第一个列表" rightTitle="第二个列表"
                            headerKey="first" headerValue="第一个列表头信息"
                            doubleHeaderKey="second" doubleHeaderValue="第二个列表头信息"
                            emptyOption="true" doubleEmptyOption="true" multiple="true" doubleMultiple="true"
                            addToLeftLabel="左移" addToRightLabel="右移" addAllToLeftLabel="全部左移" addAllToRightLabel="全部右移"
                            selectAllLabel="全选"/>
</s:form>

</body>
</html>
