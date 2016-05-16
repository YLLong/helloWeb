<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: uilong
  Date: 2016/5/12
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>商品</title>
  </head>
  <body>

  <div align="center">
      <table border="1">
          <thead>
          <tr>
              <td>商品ID</td>
              <td>商品名</td>
              <td>商品价格</td>
              <td>商品数量</td>
              <td>商品描述</td>
          </tr>
          </thead>
          <s:iterator value="list" var="goods" status="sta">
          <tr>
              <td><s:property value="#goods.id"/></td>
              <td><s:property value="#goods.goodsName"/></td>
              <td><s:property value="#goods.price"/></td>
              <td><s:property value="#goods.num"/></td>
              <td><s:property value="#goods.yieldly"/></td>
              </s:iterator>
          </tr>
      </table>
      <ul>
          <s:property value="pageNum"/>|<s:property value="totalpage"/>
          <s:url action="page" id="fristPage">
              <s:param name="pageNum">1</s:param>
          </s:url>
          <s:a href="%{fristPage}">首页</s:a>
          <s:url action="page" id="prePage">
              <s:param name="pageNum">
                  <s:property value="pageNum-1"/>
              </s:param>
          </s:url>
          <s:a href="%{prePage}">上一页</s:a>
          <s:url action="page" id="nextPage">
              <s:param name="pageNum">
                  <s:property value="pageNum+1"/>
              </s:param>
          </s:url>
          <s:a href="%{nextPage}">下一页</s:a>
          <s:url action="page" id="lastPage">
              <s:param name="pageNum">
                  <s:property value="totalpage"/>
              </s:param>
          </s:url>
          <s:a href="%{lastPage}">末页</s:a>
      </ul>
  </div>

  </body>
</html>
