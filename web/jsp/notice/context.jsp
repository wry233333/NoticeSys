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
			background-image: url("../../res/img/cover.jpg");
		}
        footer {
            text-align: center;
            width: 100%;
            float: left;
        }
        a{
            zoom: 150%;
        }
    </style>
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
</head>

<body>
<div class="div_c">
    <h1 align="center">${notice.name}</h1>
    <hr/>
    <p align="center">${notice.context}</p>
</div>

<footer>
    <div><a style="float: bottom" class="btn btn-info" href="/indexServlet?institute=${notice.institute}" role="button">返回学院<<</a></div>
</footer>

</body>
</html>
