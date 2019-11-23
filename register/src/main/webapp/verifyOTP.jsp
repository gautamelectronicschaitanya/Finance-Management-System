<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verify OTP</title>
<link rel="stylesheet" type="text/css" href="verifyOTPCss.css">

</head>
<body>
    <div id="verify">
        <form name="verifier" method="post">
        <table id="table1" align="center">

                <div id="title">
                        <h2 align = "center">VERIFY PASSWORD</h2>
                </div>

        <tr>
        <td>ENTER OTP</td>
        <td><input type="text" id="inputarea" size=25 name="phone_number" placeholder="OTP"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><button class="button button2">VERIFY OTP</button>
            </td>
        </tr>

    
        </table>
        </form>
    </div>
</body>
</html>