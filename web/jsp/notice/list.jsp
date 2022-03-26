<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <title>图书借阅信息展示</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../res/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../res/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../res/js/bootstrap.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>

    <script>

        function deleteItem(id){

            //安全提示
            if (confirm("您确定要删除吗")){

                //访问路径
            location.href="${pageContext.request.contextPath}/delItemServlet?id="+id;

            }
        }


    </script>


</head>
<body>
<div class="container">
    <h3 style="text-align: center">图书借阅信息展示</h3>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>借阅项编号</th>
            <th>用户id编号</th>
            <th>书籍id编号</th>
            <th>还书时间</th>
            <th>借书时间</th>
            <th>实际还书时间</th>
            <th>操作</th>
        </tr>


        <c:forEach items="${items}" var="item" varStatus="s">

            <tr>
                <td>${s.count}</td>
                <td>${item.id}</td>
                <td>${item.b_id}</td>
                <td>${item.return_date}</td>
                <td>${item.borrow_date}</td>
                <td>${item.rel_date}</td>
                <td>
                    <a class="btn btn-default btn-sm" href="javascript:deleteItem(${item.l_id});">删除</a>
                    <a class="btn btn-default btn-sm" href="/itemAdjServlet1?l_id=${item.l_id}">延时</a>

                </td>
            </tr>
        </c:forEach>

        <tr>

            <td>${adj_msg}</td>
            <td colspan="8" align="center"><a class="btn btn-primary" href="${pageContext.request.contextPath}/jsp/notice/add.jsp">添加借阅信息</a></td>
        </tr>


    </table>
</div>
</body>
</html>
