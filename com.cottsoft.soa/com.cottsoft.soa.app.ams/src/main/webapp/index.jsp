<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AMS</title>
</head>
<body>
	<h1>AMS,用户权限管理系统！</h1>
	
	<form action="loginServlet" method="post">
		<table>
			<tr>
				<td length="100">User Name: </td>
				<td><input name="userName" type="text" size="20"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="password" type="password" size="20"></td>
			</tr>
		</table>
		<input name="btnLogin" type="submit" value="Login">
	</form>
</body>
</html>