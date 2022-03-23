<%--
  Created by IntelliJ IDEA.
  User: 28214
  Date: 2022/3/14
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>删除数据</title>
  <link rel="stylesheet" href="../../res/css/bootstrap.min.css">

</head>
<body>
<form id="form"  action="/DeleteServlet"  method="post">
  <table class="table table-condensed" style="width:50%;" align="center">
    <!-- On rows -->
    <tr class="danger" style="font-size: 15px;">
      <td>书号</td>
      <td>书名</td>
      <td>出版商</td>
      <td>作者</td>
      <td>出版日期</td>
      <td>封面</td>
      <td>图书简介</td>
      <td>类别</td>
      <td width="10%"><input class="btn btn-danger" type="submit" value="删除"></input></td>
    </tr>
      <c:forEach items="${list}" var="book" varStatus="s">
    <tr class="info" style="font-size: 15px;" >
        <td>${book.b_id}</td>
        <td>${book.name}</td>
        <td>${book.publisher}</td>
        <td>${book.author}</td>
        <td>${book.date}</td>
        <td>${book.info}</td>
        <td>${book.context}</td>
        <td>${book.c_id}</td>
        <!--/.col-xs-6.col-lg-4-->
            <td><input type="checkbox" name="b_id" value="${book.b_id}" style="zoom: 200%;"></td>
    </tr>
      </c:forEach>
  </table>
</form>
</body>
</html>
