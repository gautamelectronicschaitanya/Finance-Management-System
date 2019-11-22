<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
     <%@ page import="org.springframework.context.ApplicationContext" %>
     <%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
     <%@ page import="com.demo.repository.AdminRepository" %>
     <%@ page import="com.demo.entity.AdminDetails" %>
     <%@ page import="com.demo.entity.BankDetails" %>
     <%@ page import="com.demo.entity.BankDetails" %>
     <%@ page import ="com.demo.entity.UserDetails"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator</title>
</head>
<body>
<h1 align="center" style="color:Blue"><font><strong>User Details</strong></font></h1>
<table align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
<tr>
<td><b>Name</b></td>
<td><b>Email</b></td>
<td><b>Password</b></td>
<td><b>Phone Number</b></td>
</tr>
<tr>
<% ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
   AdminRepository vr = ctx.getBean(AdminRepository.class);
   UserDetails ud = (UserDetails) vr.fetchById(UserDetails.class,105);
%>
<td><%out.print(ud.getNAME());%></td>
<td><%out.print(ud.getEMAIL());%></td>
<td><%out.print(ud.getPASSWORD());%></td>
<td><%out.print(ud.getPHONE_NO());%></td>
</table>
</body>
</html>