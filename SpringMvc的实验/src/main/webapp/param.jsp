<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/1/26
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<a href="param/test?username=ceshi&password=123">请求参数的绑定</a>--%>
<form action="param/Test_javabean" method="post">
    账号：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    金钱：<input type="text" name="money"><br>
    用户姓名：<input type="text" name="userList[0].name"><br>
    用户年龄：<input type="text" name="userList[0].age"><br>
    用户姓名：<input type="text" name="userMap['key'].name"><br>
    用户年龄：<input type="text" name="userMap['key'].age"><br>
    <button type="submit" >提交</button>
</form>

</body>
</html>
