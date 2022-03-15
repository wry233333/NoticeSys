<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <style type="text/css">
        .div_c{
            width: 70%;
			height: auto;
			background-color: white;
			border-radius: 10px;
			font-size: 20px;
            float: left;
            margin-left: 15%;
            height: 800px;
            opacity: 0.8;
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
        footer {
            text-align: center;
            width: 100%;
            float: left;
        }
        a{
            zoom: 150%;
        }
        p{
            font-size: 20px;
        }
    </style>
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
</head>

<body>
<div class="div_c">
    <h1 align="center">${book.name}</h1>
    <h4 align="center">出版商：${book.publisher}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作者：${book.author}
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;出版日期：${book.date}</h4>
    <hr/>
    <p align="center">${book.context}</p>
</div>

<footer>
    <div><a style="float: bottom" class="btn btn-info" href="/indexServlet?c_id=${book.c_id}" role="button">返回学院<<</a></div>
</footer>

</body>
</html>
