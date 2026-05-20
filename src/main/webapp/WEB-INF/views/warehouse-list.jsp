<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Warehouse List</title>

    <!-- Bootstrap -->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .table-container {
            margin-top: 40px;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        .btn-sm {
            border-radius: 6px;
        }
    </style>
</head>

<body>

<div class="container table-container">

    <div class="card p-4">

        <!-- Header -->
        <div class="d-flex justify-content-between align-items-center mb-3">
            <h3>🏬 Warehouse List</h3>
            <a href="add" class="btn btn-primary">+ Add Warehouse</a>
        </div>

        <!-- Table -->
        <table class="table table-bordered table-hover text-center align-middle">

            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Capacity</th>
                    <th>Manager</th>
                    <th>Contact</th>
                    <th>Actions</th>
                </tr>
            </thead>

            <tbody>

                <c:forEach var="w" items="${warehouses}">
                    <tr>
                        <td>${w.id}</td>
                        <td>${w.name}</td>
                        <td>${w.location}</td>
                        <td>${w.capacity}</td>
                        <td>${w.managerName}</td>
                        <td>${w.contact}</td>

                        <td>
                            <a href="edit?id=${w.id}" class="btn btn-warning btn-sm">Edit</a>

                            <a href="delete?id=${w.id}"
                               class="btn btn-danger btn-sm"
                               onclick="return confirm('Are you sure you want to delete this warehouse?');">
                                Delete
                            </a>
                        </td>
                    </tr>
                </c:forEach>

                <!-- If no data -->
                <c:if test="${empty warehouses}">
                    <tr>
                        <td colspan="7">No Warehouses Found</td>
                    </tr>
                </c:if>

            </tbody>

        </table>

    </div>

</div>

</body>
</html>