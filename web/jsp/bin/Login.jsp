<%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/10
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录系统</title>
    <link rel="icon" href="../../res/img/logo.ico">
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
            color: white;
        }
        .form-signin .checkbox {
            font-weight: 400;
        }
        .form-signin .form-control {
            position: relative;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            height: auto;
            padding: 10px;
            font-size: 16px;
        }
        .form-signin .form-control:focus {
            z-index: 2;
        }
        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
        body{
            background-image: url("../../res/img/cover.jpg");
        }
    </style>
</head>
<body>
<div class="container">

    <form class="form-signin" action="/loginServlet" method="post">
        <h2 class="form-signin-heading">请先登录</h2>
        <label for="inputEmail" class="sr-only">用户名：</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="请输入你的用户名" name="username" required autofocus>
        <label for="inputPassword" class="sr-only">密码：</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="请输入您的密码" name="password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <div style="margin-top: 10px">
            <a class="btn-info" href="Register.jsp">没有账号？前往注册</a>
        </div>
        <h3 align="center" style="color: red;font-weight: bolder; background-color: white">${login_msg}</h3>

    </form>

</div> <!-- /container -->
</body>
</html>
