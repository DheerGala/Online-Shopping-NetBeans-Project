<%-- 
    Document   : login
    Created on : 8 Apr, 2021, 12:21:27 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p align="right">
            <a href="login.jsp">Login/Signup</a>
        </p>
        <table width="100%">
            <tr>
                <td width="220px">
                    <a href="home.html" title="Roaming Beats">
                        <img src="pictures/logo.jpg" height="180px" width="220px" style="border-radius: 25px;">
                    </a>
                </td>
                <td>
                    <p align="center"><font size="10">Roaming Beats Merchandise Sale</font></p>
                </td>
            </tr>
        </table>
        <br>
        <form action="CheckLogin" method="post">
            <center>
                <fieldset>
                <legend><font size="5">Account Login</font></legend><br>
                <table>
                    <tr>
                        <td>
                            UserName: 
                        </td>
                        <td>
                            <input type="text" name="txtUser" placeholder="Enter UserName" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Password: 
                        </td>
                        <td>
                            <input type="password" name="txtPass" placeholder="Enter Password" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Login">
                        </td>
                        <td>
                            <input type="reset">
                        </td>
                    </tr>
                </table><br>
                <p>Don't have an Account? <a href="register.jsp">Register Here</a></p>
            </fieldset>
            </center>
        </form>
    </body>
</html>
