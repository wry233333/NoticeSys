<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>重置密码</title>
    <link rel="stylesheet" href="/res/css/bootstrap.min.css"/>
    <link rel="icon" href="/res/img/logo.ico"/>
    <style>

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
            background: url("../../res/img/cover.jpg") repeat;
            width: 100%;
            height: 100%; /* For at least Firefox */
            min-height: 100%;
            background-size: 100%;
            position:absolute;
            filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='../../res/img/cover.jpg',sizingMethod=scale);
        }

        input {
            margin-top: 10px;
        }
    </style>


    <script type="text/javascript">
        function f1() {
            document.getElementById("confirm").removeAttribute("disabled");
            document.getElementById("c_btn").href = "/mailServlet?email="+document.getElementById("inputEmail").value;
        };

        function f2() {
            const cpassword = document.getElementById("inputCpwd");
            const password = document.getElementById("inputPassword");
            if (cpassword.value != password.value) {
                window.alert("两次输入的密码不一致");
                cpassword.value = '';
                password.value = '';
                return false;
            } else {
                return true;
            }
        }
    </script>
</head>
<body>
<div class="container">
    <form class="form-signin" action="/resetServlet" method="post" onsubmit="return f2()">
        <h2 class="form-signin-heading">找回密码</h2>
        <label for="inputEmail" class="sr-only">请输入要找回密码的邮箱：</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="请输入你的邮箱地址" name="email" value="${email}" required autofocus><a id="c_btn"
            class="btn btn-info" style="margin-top: 10px;width: 300px" onclick="f1()" href="#">获取验证码</a>
        <label for="inputCheckCode" class="sr-only">请输入验证码：</label>
        <input type="text" id="inputCheckCode" class="form-control" placeholder="请输入您的验证码" name="check-code" required>
        <label for="inputCpwd" class="sr-only">请输入新密码：</label>
        <input type="password" id="inputCpwd" class="form-control" placeholder="请输入新密码" required>
        <label for="inputPassword" class="sr-only">请确认密码：</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="请确认密码" name="password" required>
        <button id="confirm" class="btn btn-lg btn-primary btn-block" type="submit" >重置密码</button>
        <p class="bg-danger" align="center"
           style="margin-top: 10px;color: white;background-color: red;font-weight: bolder; font-size: 25px; border-radius: 8px">${reset_msg}</p>
    </form>

</div>
</body>
</html>
