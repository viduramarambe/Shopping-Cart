<%-- 
    Document   : CustomerLogIn
    Created on : Jun 9, 2018, 5:54:43 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer LogIn</title>
        <style>
            #ti{
                text-align: center
            }
            table.center{
                margin-left:auto; 
                margin-right:auto; 
            }
        </style>
    </head>
    <body>
        <%
        Integer j=(Integer)session.getAttribute("s");
        
        if(null!=j){
            response.sendRedirect("BuyItem.jsp");
        }
        %>
        <h1 id="ti">Customer LogIn</h1>
        <form action="CustomerLogInController">
            <table class="center">
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username"</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"</td>
                </tr>
            </table>
            <div style="text-align: center"><input type="submit" value="LogIn"></div>
        </form>
    </body>
</html>
