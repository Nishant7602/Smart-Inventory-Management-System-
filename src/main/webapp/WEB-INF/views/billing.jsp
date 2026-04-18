<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

<title>Suppliers</title>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

</head>

<body class="container mt-4">

<h2>Suppliers</h2>

<a href="addSupplier" class="btn btn-primary">Add Supplier</a>

<table class="table table-bordered">

<tr>
<th>ID</th>
<th>Name</th>
<th>Phone</th>
</tr>

<c:forEach var="s" items="${suppliers}">

<tr>

<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.phone}</td>

</tr>

</c:forEach>

</table>

</body>

</html>