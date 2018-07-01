<%-- 
    Document   : AddCustomer
    Created on : Jun 9, 2018, 9:55:06 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Customer</title>
        <style>
            table{
                margin-left:auto; 
                margin-right:auto; 
            }
            div{
                text-align: center
            }
            h1{
                text-align: center
            }
        </style>
    </head>
    <body>
        <h1>Add Customer</h1>
        <form action="AddCustomerController">
            <table>
                <tr>
                    <td>Customer ID</td>
                    <td><input type="text" name="CustomerID"</td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="Username"</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="Password"</td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="Mobile"</td>
                </tr>
            </table>
            <div><input type="submit" value="Save"></div>
        </form>
    </body>
</html>
