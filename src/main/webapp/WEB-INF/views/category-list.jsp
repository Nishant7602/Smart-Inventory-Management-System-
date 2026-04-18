<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Category List</title>

    <style>
        body {
            font-family: Arial;
            background: #f4f6f9;
        }

        .container {
            width: 80%;
            margin: 30px auto;
        }

        h2 {
            text-align: center;
        }

        .top-bar {
            text-align: right;
            margin-bottom: 15px;
        }

        .btn {
            padding: 6px 12px;
            text-decoration: none;
            color: white;
            border-radius: 4px;
        }

        .add-btn {
            background-color: #28a745;
        }

        .edit-btn {
            background-color: #007bff;
        }

        .delete-btn {
            background-color: #dc3545;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: center;
        }

        th {
            background: #343a40;
            color: white;
        }

        tr:nth-child(even) {
            background: #f2f2f2;
        }

    </style>
</head>

<body>

<div class="container">

    <h2>📂 Category List</h2>

    <div class="top-bar">
        <a href="${pageContext.request.contextPath}/categories/add" class="btn add-btn">
            + Add Category
        </a>
    </div>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="c" items="${categories}">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.description}</td>

                <td>
                    <a href="${pageContext.request.contextPath}/categories/edit?id=${c.id}" 
                       class="btn edit-btn">Edit</a>

                    <a href="${pageContext.request.contextPath}/categories/delete?id=${c.id}" 
                       class="btn delete-btn"
                       onclick="return confirm('Are you sure you want to delete?')">
                       Delete
                    </a>
                </td>
            </tr>
        </c:forEach>

    </table>

</div>

</body>
</html>