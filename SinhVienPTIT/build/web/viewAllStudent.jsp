<%-- 
    Document   : viewAllStudent
    Created on : Apr 1, 2024, 3:29:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="MODEL.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
        <link rel="stylesheet" href="assets/CSS/style.css">
    </head>
    <body>
        <h1 class="title">DANH SACH SINH VIEN TRUONG P</h1>
        <div class="container">
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Full name</th>
                        <th>Date of Birth</th>
                        <th>Department</th>
                        <th>Approved</th>
                        <th colspan="2">Note</th>
                    </tr>
                </thead>
                <tbody>
                    <% ArrayList<Student> arr = (ArrayList<Student>)request.getAttribute("StudentList"); %>
                    <% for(int i = 0; i < arr.size(); i++){ %>
                    <tr>
                        <td><%= arr.get(i).getId() %></td>
                        <td><%= arr.get(i).getFullName() %></td>
                        <td><%= arr.get(i).getDateOfBirth() %></td>
                        <td><%= arr.get(i).getDepartment() %></td>
                        <td><%= arr.get(i).getApproved() %></td>
                        <td><a href="approved?id=<%= arr.get(i).getId() %>">Approve</a></td>
                        <td><a href="delete?id=<%= arr.get(i).getId() %>">Delete</a></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
