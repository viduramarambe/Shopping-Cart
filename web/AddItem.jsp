<%-- 
    Document   : AddItem
    Created on : Jun 9, 2018, 7:51:03 PM
    Author     : Vidura Marambe
--%>

<%@page import="java.util.List"%>
<%@page import="com.supermkt.shoppingcrt.service.impl.ItemCategoryServiceImpl"%>
<%@page import="com.supermkt.shoppingcrt.dto.ItemCategoryDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item</title>
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
        <h1>Add Item</h1>
        <form action="AddItemController">
            <table>
                <tr>
                    <td>Item ID</td>
                    <td><input type="text" name="ItemID"</td>
                </tr>
                <tr>
                    <td>Item Category</td>
                    <td>
                        <select name="itemCat">
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
                <tr>
                    <td>Unit Price</td>
                    <td><input type="text" name="UnitPrice"</td>
                </tr>
            </table>
            <div><input type="submit" value="Save"></div>
        </form>
    </body>
</html>
