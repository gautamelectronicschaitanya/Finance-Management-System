<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login-FMS</title>
<link rel="stylesheet" type="text/css" href="loginPagecss.css">

</head>
<body>
	<form method="post" action="login.lti" >
    <div id="login">
        <form name="log" method="post">
            <table id="table1" align="center">
                <div id="title">
                        <h3 align = "center">LOGIN</h3>
                </div>

                <tr>
                <td>Username</td>
                <td><input type="text" id="inputarea" size=25 name="username" placeholder="Enter username"></td>
                </tr>
        

                <tr>
                <td>Password</td>
                <td><input type="text" id="inputarea" size=25 name="password" placeholder="Enter password"></td>
                </tr>
                
                <tr>
                        <td colspan="2" align="center"> Forgot Password?<a href="forgotPassword.jsp">Click here</a>
                        </td>
                </tr>

                <tr>
                    <td colspan="2" align="center"><button class="button button2">Login</button>
                    </td>
                </tr>
                 
            </table>
        </form>
    </div>
</body>
</html>