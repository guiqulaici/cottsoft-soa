<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HR系统登成功</title>
</head>
<body>
	<h1>HR登录成功!</h1>
	<table>
		<tr>
			<td>USER ID:</td>
			<td><%=request.getAttribute("userName") %></td>
		</tr>
		<tr>
			<td>Role:</td>
			<td><%=request.getAttribute("role") %></td>
		</tr>
		<tr>
			<td>System Date:</td>
			<td><%=request.getAttribute("systemDate") %></td>
		</tr>
	</table>		
	</body>
</html>