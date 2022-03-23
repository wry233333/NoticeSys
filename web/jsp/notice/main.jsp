<%@ page import="java.util.List" %>
<%@ page import="net.f3322.wry333.bean.BookClasses" %><%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/11
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>首页</title>
    <link rel="icon" href="../../res/img/logo.ico">
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../res/css/offcanvas.css">
</head>
<body>

<!--导航栏-->
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp">借阅系统</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/index.jsp">主页</a></li>
                <li><a href="/itemListServlet">我的借阅记录</a></li>
                <li><a href="/AddServlet">添加书籍</a></li>
                <li><a href="/FindServlet">删除书籍</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">欢迎你：${user.getUsername()}</a></li>
                <li><a href="/jsp/notice/resetpwd.jsp">修改密码</a></li>
                <li><a href="/logoutServlet">退出登录</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->

<!--内容-->
<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">切换导航</button>
            </p>
            <div class="jumbotron">
                <%
                    List<BookClasses> bookClasses = (List<BookClasses>)request.getAttribute("classes");
                    String his = (String)request.getAttribute("this");
                    String name = null;
                    for (BookClasses b:bookClasses) {
                        if(b.getC_id().equals(his))name=b.getName();
                    }
                %>
                <h1><%out.print(name);%></h1>
                <p>关于各个类别的简介内容</p>
            </div>
            <div class="row" style="border-bottom: 0px">
                <c:forEach items="${list}" var="book" varStatus="s">
                    <div class="col-xs-6 col-lg-4" style="margin-top: 10px">
                        <div style="background-color: white;border-radius: 10px;padding: 5px;">
                        <h2>&nbsp;&nbsp;${book.name}</h2>
                        <p>&nbsp;&nbsp;${book.info}</p>
                        <p>&nbsp;&nbsp;<a class="btn btn-info" href="/contextServlet?b_id=${book.b_id}" role="button">查看更多 &raquo;</a></p>
                        </div>
                    </div>
                    <!--/.col-xs-6.col-lg-4-->
                </c:forEach>
            </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <%
                    for (BookClasses i: bookClasses) {
                        if(i.getC_id().equals(his)){
                            out.println(" <a href=\"/indexServlet?c_id="+i.getC_id()+"\" class=\"list-group-item active\">"+i.getName()+"</a>");
                        }
                        else {
                            out.println(" <a href=\"/indexServlet?c_id="+i.getC_id()+"\" class=\"list-group-item\">"+i.getName()+"</a>");
                        }
                    }
                %>
            </div>
        </div><!--/.sidebar-offcanvas-->
    </div><!--/row-->


    <footer>
        <p align="center">&copy; 2022 Group 6, make , powered by wry333</p>
    </footer>

</div><!--/.container-->


</body>
</html>
