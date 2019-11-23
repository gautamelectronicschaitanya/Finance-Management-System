<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
<link rel="stylesheet" type="text/css" href="registercss.css">
</head>
<body>
    <div id="register">
    <div id="user_register">
    <h3 align = "center">USER REGISTERATION FORM</h3>
    </div>
    <div id= "form">
    <form method="post"  action="registeration.lti">
    <table align="center" cellpadding = "10">
        
    <!----- Name ---------------------------------------------------------->
    <tr>
    <td>FIRST NAME</td>
    <td><input id="inputarea" type="text" name="name" maxlength="30"/>
    (max 30 characters a-z and A-Z)
    </td>
    </tr>
    
     <!----- Username ---------------------------------------------------------->
    <tr>
        <td>USERNAME</td>
        <td><input id="inputarea" type="text" name="username" maxlength="15" />
        (max 15 characters a-z,0-9 and A-Z)
        </td>
        </tr>
        
    <!----- Password---------------------------------------------------------->
    <tr>
        <td>PASSWORD</td>
        <td><input id="inputarea" type="text" name="password" maxlength="10" />
        (max 10 characters a-z,0-9 and A-Z)
        </td>
        </tr>
        
     <!----- Mobile Number ---------------------------------------------------------->
    <tr>
    <td>PHONE NUMBER</td>
    <td>
    <input id="inputarea" type="text" name="phone_no" maxlength="10" />
    (10 digit number)
    </td>
    </tr>
    

    <!----- Email Id ---------------------------------------------------------->
    <tr>
    <td>EMAIL ID</td>
    <td><input id="inputarea" type="text" name="email" maxlength="100" /></td>
    </tr>
 

    <!----- Address ---------------------------------------------------------->
        <tr>
        <td>ADDRESS <br /><br /><br /></td>
        <td><textarea id="inputarea" name="adddress" rows="4" cols="30"></textarea></td>
        </tr>


    <!----- Submit and Reset ------------------------------------------------->
    <tr>
    <td colspan="2" align="center">
    
    <!-- <a href="bankDetails.jsp" class="button button2" type="submit">NEXT</a> -->
    <button class= "button button2" type="submit">NEXT</button>
    <button class="button button2" type="reset" value="reset">RESET</button>
    </td>
    </tr>
    </table>
    <div id= "Already">
        Already a member?<a href="loginPage.jsp">Login here</a>
    </div>
    
    </form>
    </div>
</div>
</body>
</html>