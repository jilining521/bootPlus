<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<form action="/file/upload"
      method="post"
      enctype="multipart/form-data">
    文件:<input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
