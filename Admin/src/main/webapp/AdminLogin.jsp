<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator</title>
<link rel="stylesheet" type="text/css href="webapp/resouces/css/login.css" >
</head>
<body>
<h1 align="center">Administrator Login</h1>
<div class="login_div" style="border:solid 2px black;display:inline-block;margin-left:530px;margin-top:100px;">
<form action="register.lti" method="post">
<table>
<tr>
<td>
Admin User:
</td>
<td>
<input name="adminName" type="text">
</td>
<tr>
<td>
Admin Password:
</td>
<td>
<input name="adminPassword" type="text">
</td>
</tr>
</table>
<input value="submit" type="submit" style="margin-left:120px">
</div>
</form>
</body>
</html>