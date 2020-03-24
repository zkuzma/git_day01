<%--
  Created by IntelliJ IDEA.
  User: 张大雄
  Date: 2020/3/23
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<a href="./items/list">测试</a>
<input type="button" id="myBtn" value="提交">
<script src="./js/jquery.min.js"></script>
<script>
    $("#myBtn").click(function () {
        alert("ok");
        // $.ajax({
        //     url:"user/testAjax",
        //     data:'{"username":"张三","age":"22"}',
        //     contentType:"application/json;charset=utf-8",
        //     dataType:"json",
        //     type:"post",
        //     success:function (response) {
        //         alert(response);
        //         console.log(response);
        //     }
        // })

    });
</script>
</body>
</html>
