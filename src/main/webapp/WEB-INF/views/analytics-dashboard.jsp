<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Analytics Dashboard</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f4f6f9;
        }

        .dashboard-title {
            text-align: center;
            margin: 20px 0;
            font-weight: bold;
        }

        .card-box {
            border-radius: 12px;
            padding: 20px;
            color: white;
            text-align: center;
            transition: 0.3s;
        }

        .card-box:hover {
            transform: scale(1.05);
        }

        .revenue { background: linear-gradient(45deg, #28a745, #218838); }
        .orders  { background: linear-gradient(45deg, #007bff, #0056b3); }
        .products{ background: linear-gradient(45deg, #ffc107, #e0a800); color:black; }
        .users   { background: linear-gradient(45deg, #dc3545, #bd2130); }

        .value {
            font-size: 28px;
            font-weight: bold;
        }

        .low-stock-section {
            margin-top: 40px;
        }

        .nav-links {
            margin-top: 40px;
            text-align: center;
        }

        .nav-links a {
            margin: 8px;
        }
    </style>
</head>

<body>

<div class="container">

    <h2 class="dashboard-title">📊 Analytics Dashboard</h2>

    <!-- 📊 Cards -->
    <div class="row g-4">

        <div class="col-md-3">
            <div class="card-box revenue">
                <h5>Total Revenue</h5>
                <div class="value">₹ ${totalRevenue}</div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card-box orders">
                <h5>Total Orders</h5>
                <div class="value">${totalInvoices}</div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card-box products">
                <h5>Total Products</h5>
                <div class="value">${totalProducts}</div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card-box users">
                <h5>Total Users</h5>
                <div class="value">${totalUsers}</div>
            </div>
        </div>

    </div>

    <!-- ⚠️ Low Stock Products -->
    <div class="low-stock-section">

        <h4 class="mt-4 text-danger">⚠️ Low Stock Products</h4>

        <c:choose>

            <c:when test="${empty products}">
                <div class="alert alert-success mt-3">
                    All products are sufficiently stocked 👍
                </div>
            </c:when>

            <c:otherwise>
                <table class="table table-bordered table-striped mt-3">
                    <thead class="table-danger">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="p" items="${products}">
                            <tr>
                                <td>${p.id}</td>
                                <td>${p.name}</td>
                                <td>₹ ${p.price}</td>
                                <td>
                                    <span class="badge bg-danger">
                                        ${p.stock}
                                    </span>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:otherwise>

        </c:choose>

    </div>

    <!-- 🔗 Navigation -->
    <div class="nav-links">
        <a href="<c:url value='/user/list'/>" class="btn btn-primary">Manage Users</a>
        <a href="<c:url value='/product/list'/>" class="btn btn-success">Manage Products</a>
        <a href="<c:url value='/invoice/list'/>" class="btn btn-warning">Manage Invoices</a>
        <a href="<c:url value='/warehouse/list'/>" class="btn btn-info">Manage Warehouses</a>
    </div>

</div>

</body>
</html>