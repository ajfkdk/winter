<%--
  Created by IntelliJ IDEA.
  User: 86151
  Date: 2021/1/27
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<h3>文件上传</h3>
<form action="file/fileUpload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
<input type="submit" value="上传文件">
</form>
<hr>
<br>
<form action="file/fileUpload2" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传文件">
</form>
</body>
</html>
