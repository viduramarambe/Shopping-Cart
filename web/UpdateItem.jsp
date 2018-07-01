<%-- 
    Document   : UpdateItem
    Created on : Jun 9, 2018, 7:51:22 PM
    Author     : Vidura Marambe
--%>

<%@page import="com.supermkt.shoppingcrt.service.impl.ItemCategoryServiceImpl"%>
<%@page import="com.supermkt.shoppingcrt.dto.ItemCategoryDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Item</title>
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
        <h1>Update Item</h1>
        <form action="UpdateItemController">
            <table>
                <tr>
                    <td>Item ID</td>
                    <td><input type="text" name="ItemID"</td>
                </tr>
                <tr>
                    <td>Item Category</td>
                    <td>
                        <select id="itemCat" name="itemCat">
                            <%
                           List<ItemCategoryDTO> getitemcat=new ItemCategoryServiceImpl().showItemCategories();
                           for(ItemCategoryDTO categoryDTO:getitemcat){
                        %>
                        <option>  <%=categoryDTO.getItemCategory()%> </option>
                        <%
                           }
                        %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Item Name</td>
                    <td><input type="text" name="ItemName"</td>
                </tr>
                <tr>
                    <td>Item Quantity</td>
                    <td><input type="text" name="ItemQty"</td>
                </tr>
                <td>Unit Price</td>
                    <td><input type="text" name="UnitPrice"</td>
            </table>
            <div><input type="submit" value="Update"></div>
        </form>
    </body>
</html>
