<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form method="post" action="register.lti" enctype="multipart/form-data">
Enter your name : <input type="text" name="name" /> <br/>
Enter your age : <input type="text" name="age" /> <br/>
Enter your email address : <input type="text" name="email" /> <br/>
Enter your city : <input type="text" name="city" /> <br/>
Upload your profile Pic : <input type="file" name="profilePic" /> <br/>
<button type="submit">Register</button>
</form>
</body>
</html>