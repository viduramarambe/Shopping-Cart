<%-- 
    Document   : AddItemCategory
    Created on : Jun 9, 2018, 7:16:48 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item Category</title>
        <style>
            h1{
                text-align: center
            }
            table{
                margin-left:auto; 
                margin-right:auto; 
            }
            div{
                text-align: center
            }
        </style>
    </head>
    <body>
        <h1>Add Item Category</h1>
        <form action="AddItemCategoryController">
            <table>
                <tr>
                    <td>Item Category ID</td>
                    <td><input type="text" name="ItemCatId"</td>
                </tr>
                <tr>
                    <td>Item Category</td>
                    <td><input type="text" name="ItemCat"</td>
                </tr>
            </table>
            <div><input type="submit" value="Save"></div>
        </form>
    </body>
</html>
