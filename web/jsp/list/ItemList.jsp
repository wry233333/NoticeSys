<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/15
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>您的借阅记录</title>
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
    <link rel="icon" href="../../res/img/logo.ico">
    <style>
        .title{
            background-color: white;
            border-radius: 10px;
            width: 70%;
            height: 300px;
        }

        body{
            background: url("../../res/img/cover.jpg") repeat;
            width: 100%;
            height: 100%; /* For at least Firefox */
            min-height: 100%;
            background-size: 100%;
            position:absolute;
            filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='../../res/img/cover.jpg',sizingMethod=scale);
        }

    </style>
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
                <li><a href="/indexServlet?c_id=1">主页</a></li>
                <li class="active"><a href="#">我的借阅记录</a></li>
                <li><a href="#">联系我们</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">欢迎你：${user.getUsername()}</a></li>
                <li><a href="/jsp/notice/resetpwd.jsp">修改密码</a></li>
                <li><a href="/logoutServlet">退出登录</a></li>
            </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->
<div class="container">
    <div class="jumbotron" style="margin-top: 70px">
        <h1>你的借阅记录</h1>
        <p>您在本系统借阅的历史记录将在本页显示，请记得按时还书哦.......</p>
    </div>
    <div class="jumbotron"style= "margin-top: 20px">
        <div class="page-header">
            <h3>借阅记录&nbsp;&nbsp;&nbsp;&nbsp;<small>用户:${user.username}</small></h3>
        </div>
        <div style="width: 100%">
            <table class="table table-hover">
                <tr>
                    <td>#</td>
                    <td>记录编号</td>
                    <td>图书名称</td>
                    <td>借阅时间</td>
                    <td>应还时间</td>
                    <td>归还时间</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${itemList}" var="i" varStatus="s">
                    <tr>
                        <td>${s.count}</td>
                        <td>${i.l_id}</td>
                        <td>${i.b_name}</td>
                        <td>${i.borrow_date}</td>
                        <td>${i.return_date}</td>
                        <td>${i.rel_date}</td>
                        <td><input class="btn btn-info" type="button" value="延时"></td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
</div>

</body>
</html>
