<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/1/27
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
<h1>哦吼，出现了一个错误</h1>
${requestScope.get("message")}
</body>
</html>
