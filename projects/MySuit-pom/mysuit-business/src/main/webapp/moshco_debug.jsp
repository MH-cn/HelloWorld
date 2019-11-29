<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>调式主页</title>
</head>
<body>

<h3>调试主页</h3>
<a href="${pageContext.request.contextPath }/debug/login?userId=000001" 
	target="_blank">主页框架（用户：000001 系统的管理员）</a>
&nbsp;&nbsp;&nbsp;&nbsp;<br />
<br /><br /><br />
<a href="${pageContext.request.contextPath }/home/toLogin" target="_blank">登录</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath }/home/logout" target="_blank">注销</a>

</body>
</html>