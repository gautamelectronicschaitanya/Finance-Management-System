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
<div style="border:solid 2px black;display:inline-block;"></div>
<table align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
<tr>
<td><b>Name</b></td>
<td><b>Email</b></td>
<td><b>Password</b></td>
<td><b>Phone Number</b></td>
</tr>
<tr>
<% 
ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
AdminRepository ar = ctx.getBean(AdminRepository.class);
ArrayList<UserDetails> uds = (ArrayList<UserDetails>)ar.FectAllUserDetails();
%>
<%for(UserDetails ud:uds){%>
<tr>
<td><%out.println(ud.getNAME());%></td>
<td><%out.println(ud.getEMAIL());%></td>
<td><%out.println(ud.getPASSWORD());%></td>
<td><%out.println(ud.getPHONE_NO());%></td>
<td><a href="UPDATE.jsp">UPDATE</a></td>
<td><a href="DELETE.jsp">DELETE</a></td>
<td><input type="radio" name="auth" value="Active">Active<br></td>
<td><input type="radio" name="auth value="deactive">Deactive<br></td>
</tr>
<%} %>
</tr>
</table>
<%


%>
</body>
</html>