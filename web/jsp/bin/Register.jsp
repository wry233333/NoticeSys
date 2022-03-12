<%--
  Created by IntelliJ IDEA.
  User: WRY
  Date: 2022/3/10
  Time: 17:58
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
            background: url("../../res/img/cover.jpg")no-repeat;
            width: 100%;
            height: 100%; /* For at least Firefox */
            min-height: 100%;
            background-size:100% 100%;
            position:absolute;
            filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='../../res/img/cover.jpg',sizingMethod=scale);
        }
        input{
            margin-top: 10px;
        }
        .select_g{
            background-color: white;
            height: 30px;
            margin-top: 10px;
            border-radius: 5px;
        }
        button{
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="container">

    <form class="form-signin" action="/registerServlet" method="post">
        <h2 class="form-signin-heading">请先登录</h2>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="请输入你的用户名" name="username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="请输入您的密码" name="password" required>
        <label for="email" class="sr-only">Email</label>
        <input type="text" id="email" class="form-control" placeholder="请输入您的邮箱" name="email" required>
        <div class="select_g">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" style="margin-top: 10px" name="gender" required value="男" checked> 男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input style="margin-top: 10px" type="radio" name="gender" required  value="女">女
        </div>


        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        <div style="margin-top: 10px">
            <a class="btn btn-info" href="Login.jsp">已有账号？前往登录</a>
        </div>
        <p class="bg-danger" align="center" style="color: white;font-weight: bolder; font-size: 25px; border-radius: 8px;margin-top: 10px">${reg_msg}</p>

    </form>

</div> <!-- /container -->
</body>
</html>

