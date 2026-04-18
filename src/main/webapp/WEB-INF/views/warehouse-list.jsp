<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Warehouses</title></head>
<body>
<style>

        /* 🌙 Page */
        body {
            font-family: 'Segoe UI', Arial;
            background: #f4f6f9;
            margin: 0;
        }

        .container {
            width: 90%;
            margin: 30px auto;
        }

        /* 🔷 Header */
        .top-bar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
        }

        h2 {
            color: #333;
        }

        /* 🔘 Button */
        .btn {
            padding: 8px 14px;
            border-radius: 6px;
            text-decoration: none;
            color: white;
            font-size: 14px;
        }

        .add-btn {
            background: #28a745;
        }

        .edit-btn {
            background: #007bff;
        }

        .delete-btn {
            background: #dc3545;
        }

        /* 📊 Table */
        table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 10px rgba(0,0,0,0.08);
        }

        th {
            background: #1e293b;
            color: white;
            padding: 12px;
            text-transform: uppercase;
        }

        td {
            padding: 12px;
            text-align: center;
            border-bottom: 1px solid #eee;
        }

        tr:hover {
            background: #f1f5f9;
        }

        tr:nth-child(even) {
            background: #fafafa;
        }

    </style>
<h2>Warehouses</h2>
<a href="add">Add Warehouse</a>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Location</th><th>Actions</th></tr>
    <c:forEach var="w" items="${warehouses}">
        <tr>
            <td>${w.id}</td>
            <td>${w.name}</td>
            <td>${w.location}</td>
            <td>
                <a href="warehouses/edit/${w.id}">Edit</a>
                <a href="warehouses/delete/${w.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/smart-inventory-web/dashboard">Dashboard</a>
</body>
</html>