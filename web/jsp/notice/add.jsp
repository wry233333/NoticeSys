<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加图书借阅信息</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../res/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../res/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../res/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <center><h3>添加借阅图书页面</h3></center>
    <form action="${pageContext.request.contextPath}/addItemServlet" method="post">
        <div class="form-group">
            <label for="l_id">借阅项编号：</label>
            <input type="text" class="form-control" id="l_id" name="l_id" placeholder="请输入借阅项编号">
        </div>

        <div class="form-group">
            <label for="id">用户id编号：</label>
            <input type="text" class="form-control" id="id" name="id" placeholder="请输入用户id编号">
        </div>

        <div class="form-group">
            <label for="b_id">书籍id编号：</label>
            <input type="text" class="form-control" id="b_id" name="b_id" placeholder="请输入书籍id编号">
        </div>

        <div class="form-group">
            <label for="return_date">预计还书时间：</label>
            <input type="text" class="form-control" id="return_date" name="return_date" placeholder="请输入约定借书时间">
        </div>

        <div class="form-group">
            <label for="borrow_date">借书时间：</label>
            <input type="text" class="form-control" id="borrow_date" name="borrow_date" placeholder="请输入借阅书籍时间">
        </div>

        <div class="form-group">
            <label for="rel_date">实际还书时间：</label>
            <input type="text" class="form-control" id="rel_date" name="rel_date" placeholder="请输入实际还书时间">
        </div>


        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" />
        </div>
    </form>
</div>
</body>
</html>
