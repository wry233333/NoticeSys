<%--
  Created by IntelliJ IDEA.
  User: 46156
  Date: 2022/3/21
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <title>首页</title>

  <!-- 1. 导入CSS的全局样式 -->
  <link href="../../res/css/bootstrap.min.css" rel="stylesheet">
  <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
  <script src="../../res/js/jquery-2.1.0.min.js"></script>
  <!-- 3. 导入bootstrap的js文件 -->
  <script src="../../res/js/bootstrap.js"></script>
  <script type="text/javascript">
  </script>
</head>
<body>

<div align="center">

  <a
          href="${pageContext.request.contextPath}/itemListServlet" style="text-decoration:none;font-size:33px">查询所有用户信息
  </a>


</div>
</body>
</html>
