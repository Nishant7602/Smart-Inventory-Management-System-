<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Billing List</title>
    <style>
        body {
            font-family: Arial;
        }
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            padding: 5px 10px;
            background-color: #007bff;
            color: white;
            border-radius: 4px;
        }
        .top-bar {
            text-align: center;
            margin: 20px;
        }
    </style>
</head>
<body>

<div class="top-bar">
    <h2>Billing List</h2>

    <a href="${pageContext.request.contextPath}/billing/add">Add New Bill</a>
</div>

<table>
    <tr>
        <th>ID</th>
        <th>Customer Name</th>
        <th>Amount</th>
        <th>Date</th>
        <th>Actions</th>
    </tr>

    <c:forEach var="bill" items="${billings}">
        <tr>
            <td>${bill.id}</td>
            <td>${bill.customerName}</td>
            <td>${bill.totalAmount}</td>
            <td>${bill.orderDate}</td>

            <td>
                <a href="${pageContext.request.contextPath}/billing/edit?id=${bill.id}">Edit</a>
                |
                <a href="${pageContext.request.contextPath}/billing/delete?id=${bill.id}"
                   s>Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>