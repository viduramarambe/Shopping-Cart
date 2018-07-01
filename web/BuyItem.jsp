<%-- 
    Document   : BuyItem
    Created on : Jun 17, 2018, 9:42:53 AM
    Author     : Vidura Marambe
--%>

<%@page import="com.supermkt.shoppingcrt.service.impl.ItemServiceImpl"%>
<%@page import="com.supermkt.shoppingcrt.dto.ItemDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Item</title>
        <style>
            table,th,td{
                border: solid black;
                border-collapse: collapse;
                
            }
        </style>
    </head>
    <body>
        
        <h1 style="text-align: center">Buy Item</h1>
        <table style="margin-left: auto; margin-right: auto">
            <tr>
            <td> Item ID </td>
            <td> Item Category </td>
            <td> Item Name </td>
            <td> Item Qty </td>
            <td> Unit Price </td>
            </tr>
            <%
            List<ItemDTO> readItems= new ItemServiceImpl().showItems();
            for (ItemDTO readItem : readItems) {
            %>
            <tr>
            <td> <%=readItem.getItemId()%> </td>
            <td> <%=readItem.getItemCategory()%> </td>
            <td> <%=readItem.getItemName()%> </td>
            <td> <%=readItem.getItemQty()%> </td>
            <td> <%=readItem.getUnitPrice()%> </td>
            <td><a href="BuyItemController?itm=<%=readItem.getItemQty()%>"> buy</a></td>
            </tr>
            <% } %>
        </table>
        <div style="text-align: center"><a href="OwnerLogOutController"><input type="button" value="Log out"></a></div>
    </body>
</html>
