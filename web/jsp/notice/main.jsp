<%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/11
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>公告首页</title>
    <link rel="icon" href="../../res/img/logo.ico">
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../res/css/offcanvas.css">
</head>
<body>

<!--导航栏-->
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">公告系统</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">主页</a></li>
                <li><a href="#">添加公告</a></li>
                <li><a href="#">联系我们</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">欢迎你：${user.getUsername()}</a></li>
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
                <h1>公告名</h1>
                <p>简介内容</p>
            </div>
            <div class="row">

                <div class="col-xs-6 col-lg-4">
                    <h2>公告1</h2>
                    <p>公告1内容 </p>
                    <p><a class="btn btn-default" href="#" role="button">查看更多 &raquo;</a></p>
                </div><!--/.col-xs-6.col-lg-4-->
                <c:forEach items="${list}" var="notice" varStatus="s">
                    <div class="col-xs-6 col-lg-4">
                        <h2>${notice.name}</h2>
                        <p>${notice.info}</p>
                        <p><a class="btn btn-default" href="#" role="button">查看更多 &raquo;</a></p>
                    </div><!--/.col-xs-6.col-lg-4-->
                </c:forEach>
            </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <a href="#" class="list-group-item active">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
            </div>
        </div><!--/.sidebar-offcanvas-->
    </div><!--/row-->

    <hr>

    <footer>
        <p>&copy; 2016 Company, Inc.</p>
    </footer>

</div><!--/.container-->


</body>
</html>
