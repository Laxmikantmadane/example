<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h1>Employee List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Position</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.position}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
