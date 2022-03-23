<%--
  Created by IntelliJ IDEA.
  User: 28214
  Date: 2022/3/11
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加公告</title>
    <link rel="stylesheet" href="../../res/css/bootstrap.min.css">
</head>
<body>
<form class="form-horizontal" action="/AddServlet" method="post">

        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10" style="width: 60%">
                <input type="text" name="name" class="form-control" id="inputPassword3" placeholder="书名">
            </div>
        </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="publisher" class="form-control" id="inputPassword3" placeholder="出版商">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="author" class="form-control" id="inputPassword3" placeholder="作者">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="date" class="form-control" id="inputPassword3" placeholder="出版日期">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="info" class="form-control" id="inputPassword3" placeholder="封面url">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="context" class="form-control" id="inputPassword3" placeholder="图书简介">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label"></label>
        <div class="col-sm-10" style="width: 60%">
            <input type="text" name="c_id" class="form-control" id="inputPassword3" placeholder="类别">
        </div>
    </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button class="btn btn-danger" type="submit">提交</button>
            </div>
        </div>
    <p class="bg-danger" align="center" style="margin-top: 10px;color: white;background-color: red;font-weight: bolder; font-size: 25px; border-radius: 8px">${add_msg}</p>
    </form>
</body>
</html>
