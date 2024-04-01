<%-- 
    Document   : ConfirmDelete
    Created on : Apr 1, 2024, 5:20:46 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Delete</title>
    </head>
    <body>
        <form action="delete" method="post">
            <% String id = (String)request.getAttribute("Id"); %>
            <h2 class="title">Are you want to delete this student with id = <%= id %></h2>
            <input type="text" value="<%= id %>" name="id" style="display: none;">
            <input type="submit" value="Confirm Delete" name="confirm">
            <input type="submit" value="Cancel" name="cancel">
        </form>
    </body>
</html>
