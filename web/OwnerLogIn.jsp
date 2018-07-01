<%-- 
    Document   : OwnerLogIn
    Created on : Jun 9, 2018, 5:53:41 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owner LogIn</title>
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
        Integer i=(Integer)session.getAttribute("i");
        
        if(null!=i){
            response.sendRedirect("Owner.jsp");
        }
        %>
        <h1 id="ti">Owner LogIn</h1>
        <form action="OwnerLogInController">
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
            <div style="text-align: center"><input type="submit" value="LogIn"><a href="OwnerSignIn.jsp"><input type="button" value="Sign In"></a></div>
        </form>
    </body>
</html>
