<%-- 
    Document   : Owner
    Created on : Jun 9, 2018, 7:17:58 PM
    Author     : Vidura Marambe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owner</title>
        <style>
            h1{
                text-align: center
            }
            h3{
                text-align: center
            }
        </style>
    </head>
    <body>
        <%
        Integer i=(Integer)session.getAttribute("i");
        
        if(null==i){
            response.sendRedirect("OwnerLogIn.jsp");
        }
        %>
        <h1>Owner</h1>
        <h3><a href="AddItemCategory.jsp">Add Item Category</a></h3>
        <h3><a href="AddItem.jsp">Add Item</a></h3>
        <h3><a href="UpdateItem.jsp">Update Item</a></h3>
        <h3><a href="DeleteItem.jsp">Delete Item</a></h3>
        <h3><a href="ViewItemController">View Items</a></h3>
        <h3><a href="AddCustomer.jsp">Add Customer</a></h3>
        <h3><a href="UpdateCustomer.jsp">Update Customer</a></h3>
        <h3><a href="DeleteCustomer.jsp">Delete Customer</a></h3>
        <h3><a href="ViewCustomerController">View Customer</a></h3>
        <div style="text-align: center"><a href="OwnerLogOutController"><input type="button" value="Log out"></a></div>
    </body>
</html>
