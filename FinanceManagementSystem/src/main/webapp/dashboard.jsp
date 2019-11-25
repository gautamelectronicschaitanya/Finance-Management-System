<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h1>Dashboard</h1>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th></tr>  

 <tr>  
 <c:forEach var="v" items="${list}">
   <td>${v.userid}</td>
   <td>${v.username}</td>
   <td><a href="editemp/${emp.id}">Edit</a></td>  
   <td><a href="deleteemp/${emp.id}">Delete</a></td>  
   </tr>
</c:forEach>
</table>
</body>
</html>