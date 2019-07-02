<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE HTML>
<html lang="zh">
<head>
<title>轻松短租网 - 注册</title>
<style type="text/css">
body {
	text-align: center;
}

th, td {
    text-align: left;
    padding: 8px 4px;
}
</style>
</head>

<body>
	<%
		String register_result = (String) request.getAttribute("register_result");
		if (register_result != null)  {
	%>
	<h2><%= register_result %></h2>
	<%
		}
	%>
	<h2>${register_result}</h2>
    <form action="?request=register" method="post">
        <table style="margin: auto">
            <tr>
                <td>用户名:</td>
                <td><input width="auto" type="text" required="required" autocomplete="username"
                    name="name"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input width="auto" type="password" required="required" autocomplete="new-password"
                    id="form_passwd" name="passwd"></td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td><input width="auto" type="password" required="required" autocomplete="new-password"
                    id="form_passwd_two" name="passwd"></td>
            </tr>
        </table>
        <br>
        <button type="submit">注册</button>
    </form>

</body>
</html>
<%@ page trimDirectiveWhitespaces="true" %>