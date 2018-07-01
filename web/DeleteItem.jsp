<%-- 
    Document   : DeleteItem
    Created on : Jun 9, 2018, 7:52:31 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Item</title>
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
        <h1>Delete Item</h1>
        <form action="DeleteItemController">
            <table>
                <tr>
                    <td>Item ID</td>
                    <td><input type="text" name="ItemID"</td>
                </tr>
            </table>
            <div><input type="submit" value="Delete"></div>
        </form>
    </body>
</html>
