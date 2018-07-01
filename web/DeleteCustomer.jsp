<%-- 
    Document   : DeleteCustomer
    Created on : Jun 9, 2018, 9:56:04 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Customer</title>
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
        <h1>Delete Customer</h1>
        <form action="DeleteCustomerController">
            <table>
                <tr>
                    <td>Customer ID</td>
                    <td><input type="text" name="CustomerID"</td>
                </tr>
            </table>
            <div><input type="submit" value="Delete"></div>
        </form>
    </body>
</html>
