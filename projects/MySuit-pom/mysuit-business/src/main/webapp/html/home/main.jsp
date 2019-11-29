<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户主页</title>
</head>
<body>
${pageContext.request.contextPath }
<h1>${param.userName }</h1>
</body>
</html>