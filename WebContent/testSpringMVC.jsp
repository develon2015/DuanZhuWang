<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String result = "A";
%>
<!DOCTYPE HTML>
<html lang="zh">
<head>
<title>View - from SpringMVC</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<h1>View - from SpringMVC</h1>
	<%
		if (request.getAttribute("a") != null)  {
	%>
	<h2><%=request.getAttribute("a") %></h2>
	<%
		} else {
	%>
	<h2>無錯誤</h2>
	<%
		}
	%>
</body>
</html>
<%@ page trimDirectiveWhitespaces="true" %>