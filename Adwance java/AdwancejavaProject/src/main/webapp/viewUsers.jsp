<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.user.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Users</title>

<style>
body {
    font-family: Arial;
    background: #f4f4f4;
}
h2 {
    text-align: center;
}
table {
    border-collapse: collapse;
    width: 80%;
    margin: auto;
    background: white;
}
th, td {
    padding: 10px;
    border: 1px solid #ccc;
    text-align: center;
}
th {
    background: #1e293b;
    color: white;
}
tr:nth-child(even) {
    background: #f2f2f2;
}
</style>
</head>

<body>

<h2>👤 Registered Users</h2>

<table>
    <tr>
        <th>ID</th>
        <th>User Name</th>
        <th>Email</th>
        <th>Mobile No</th>
    </tr>

<%
List<User> users = (List<User>) request.getAttribute("users");

if (users != null && !users.isEmpty()) {
    for (User u : users) {
%>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getUserName() %></td>
        <td><%= u.getEmail() %></td>
        <td><%= u.getMobileNO() %></td>
    </tr>
<%
    }
} else {
%>
    <tr>
        <td colspan="4">No users found</td>
    </tr>
<%
}
%>

</table>

</body>
</html>
