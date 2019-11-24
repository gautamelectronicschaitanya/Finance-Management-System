<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

<form method="post" action="register.lti" enctype="multipart/form-data">
Enter your name : <input name="name" /> <br />
Enter email id : <input name="email" /> <br />
Enter password : <input name="password" /> <br />
Enter city : <input name="city" /> <br />
Enter pincode : <input name="pincode" /> <br />
Enter country : <input name="country" /> <br />
Upload your profile pic : <input type="file" name="profilePic" /> <br />
<button type="submit">Register</button>
</form>

</body>
</html>