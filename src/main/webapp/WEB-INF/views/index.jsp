<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>Inventory Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
background:#f4f6f9;
}

.navbar{
background:#2c3e50;
}

.navbar-brand{
color:white;
font-weight:bold;
}

.card{
transition:0.3s;
}

.card:hover{
transform:scale(1.05);
}
</style>

</head>

<body>

<!-- Navbar -->

<nav class="navbar navbar-expand-lg">
<div class="container-fluid">
<a class="navbar-brand">Smart Inventory System</a>
</div>
</nav>


<div class="container mt-5">

<h2 class="text-center mb-4">Dashboard</h2>

<div class="row">

<!-- Product -->

<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">

<h4>Products</h4>

<p>Manage all products</p>

<a href="product/list" class="btn btn-primary">Open</a>

</div>
</div>
</div>


<!-- Supplier -->

<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">

<h4>Suppliers</h4>

<p>Manage suppliers</p>

<a href="supplier/list" class="btn btn-success">Open</a>

</div>
</div>
</div>


<!-- Warehouse -->

<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">

<h4>Warehouse</h4>

<p>Manage warehouse</p>

<a href="warehouse/list" class="btn btn-warning">Open</a>

</div>
</div>
</div>

</div>

<br>

<div class="row">

<!-- Billing -->

<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">

<h4>Billing System</h4>

<p>Create invoices and manage orders</p>

<a href="billing/list" class="btn btn-danger">Open</a>

</div>
</div>
</div>


<!-- Analytics -->

<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">

<h4>Analytics</h4>

<p>View sales reports</p>

<a href="analytics/dashboard" class="btn btn-dark">Open</a>

</div>
</div>
</div>

<!-- Users -->
<div class="col-md-4">
<div class="card text-center shadow">
<div class="card-body">
<h4>Users</h4>
<p>Manage users</p>
<a href="${pageContext.request.contextPath}/user/list" class="btn btn-primary">Open</a>
</div>
</div>
</div>

<div class="col-md-4">
<div class="card-body">
<div class="card text-center shadow">
    <h3>🧾 Invoices</h3>
    <p>Manage all invoices</p>
    <a href="invoice/list">View Invoices</a>
</div>
</div>
</div>
</body>
</html>