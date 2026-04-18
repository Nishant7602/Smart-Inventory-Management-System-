
<style>
/* Page Background */
body {
    font-family: 'Segoe UI', Arial, sans-serif;
    background: #f4f6f9;
    margin: 0;
    padding: 0;
}

/* Container */
.container {
    width: 90%;
    margin: 30px auto;
}

/* Title */
h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
}

/* Top Bar */
.top-bar {
    display: flex;
    justify-content: space-between;
    margin-bottom: 15px;
}

/* Buttons */
.btn {
    padding: 8px 14px;
    text-decoration: none;
    color: white;
    border-radius: 6px;
    font-size: 14px;
    transition: 0.3s;
}

.add-btn {
    background: #28a745;
}

.add-btn:hover {
    background: #218838;
}

.edit-btn {
    background: #007bff;
}

.edit-btn:hover {
    background: #0056b3;
}

.delete-btn {
    background: #dc3545;
}

.delete-btn:hover {
    background: #b02a37;
}

/* Table */
table {
    width: 100%;
    border-collapse: collapse;
    background: white;
    border-radius: 10px;
    overflow: hidden;
    box-shadow: 0 4px 12px rgba(0,0,0,0.08);
}

/* Table Header */
th {
    background: #1e293b;
    color: white;
    padding: 12px;
    text-transform: uppercase;
    font-size: 13px;
}

/* Table Data */
td {
    padding: 12px;
    text-align: center;
    border-bottom: 1px solid #eee;
}

/* Row Hover */
tr:hover {
    background: #f1f5f9;
}

/* Zebra Rows */
tr:nth-child(even) {
    background: #fafafa;
}

/* Action Buttons Spacing */
td a {
    margin: 0 4px;
}

/* Responsive */
@media (max-width: 768px) {
    table {
        font-size: 12px;
    }
}


</style>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Invoice List</title>
</head>
<body>

<h2>Invoice List</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Product</th>
        <th>Amount</th>
    </tr>

   <c:forEach var="inv" items="${invoices}">
<tr>
    <td>${inv.id}</td>
    <td>${inv.product.name}</td>
    <td>${inv.quantity}</td>
    <td>${inv.price}</td>
    <td>${inv.total}</td>

    <td>
        <a href="edit?id=${inv.id}">Edit</a> |
        <a href="delete?id=${inv.id}" onclick="return confirm('Delete?')">Delete</a>
    </td>
</tr>
</c:forEach>
</table>

</body>
</html>