<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/1/27
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery.min.js"></script>

<body>
<a href="return/ModelAndView">测试ModelAndView</a>
<div class="html-editor-align-center">
    <h1><a href="return/testForward">forward转发</a></h1>
</div>
<br>
<hr>
<div class="html-editor-align-center">
    <h1><a href="return/testRedirect">Redirect重定向</a></h1>
</div>
<br>
<br>
<button id="btn">发送ajax请求</button>
</body>
<script>
    $("#btn").click(function () {
      $.ajax({
          url:"ajax/ajax",
          contentType:"application/json;charset=utf-8",
          data:'{"name":"hehe","age":"123"}',
          dataType:"json",
          type:"post",
          success:function (data) {
    alert(data)

          }
      })
    });
</script>
</html>
