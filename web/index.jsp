<%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/10
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>借阅系统</title>
    <link rel="icon" href="/res/img/logo.ico">
    <link rel="stylesheet" href="/res/css/bootstrap.min.css">
    <link rel="stylesheet" href="/res/css/cover.css">
</head>
<body>
<div class="img_c">
    <div class="site-wrapper">
        <div class="site-wrapper-inner">
            <div class="cover-container">
                <div class="masthead clearfix">
                    <div class="inner">
                        <h3 class="masthead-brand">借阅系统</h3>
                        <nav>
                            <ul class="nav masthead-nav">
                                <li class="active"><a href="#">主页</a></li>
                                <li><a href="/indexServlet?c_id=1">全部分类</a></li>
                                <li><a href="/jsp/bin/Login.jsp">登录</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="inner cover">
                    <h1 class="cover-heading">欢迎使用图书借阅系统</h1>
                    <p class="lead">本系统是用来管理图书借阅的</p>
                    <p class="lead">
                        <a href="/indexServlet?bookClasses=计算机学院" class="btn btn-lg btn-info">进入系统</a>
                    </p>
                </div>
                <div class="mastfoot">
                    <div class="inner">
                        <p>本系统用于jsp设计，结课作业使用，多有不足，请多海涵.....</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
