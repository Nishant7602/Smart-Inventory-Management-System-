<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Products</title>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>

<body class="container mt-4">

<h2>Products</h2>

<a href="addProduct" class="btn btn-primary">Add Product</a>

<table class="table table-bordered mt-3">

<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>Stock</th>
<th>Actions</th>
</tr>

<c:forEach var="p" items="${products}">

<tr>

<td>${p.id}</td>
<td>${p.name}</td>
<td>${p.price}</td>
<td>${p.stock}</td>

<td>

<a href="editProduct?id=${p.id}" class="btn btn-warning">Edit</a>

<a href="delete?id=${p.id}" class="btn btn-danger">Delete</a>

</td>

</tr>

</c:forEach>

</table>

</body>
</html>