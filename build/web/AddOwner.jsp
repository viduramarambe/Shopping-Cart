<%-- 
    Document   : AddOwner
    Created on : Jun 14, 2018, 1:51:01 AM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Owner</title>
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
        <h1 id="ti">Add Owner</h1>
        <form action="AddOwnerController">
            <table class="center">
                <tr>
                    <td>OwnerID</td>
                    <td><input type="text" name="ownerID"</td>
                </tr>
                <tr>
                    <td>UserName</td>
                    <td><input type="text" name="username"</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"</td>
                </tr>
            </table>
            <div style="text-align: center"><input type="submit" value="Save"></div>
        </form>
    </body>
</html>
