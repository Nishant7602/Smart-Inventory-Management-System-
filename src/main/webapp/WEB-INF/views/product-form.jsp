<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Product Form</title></head>
<body>
<h2>Product Form</h2>
<form action="save" method="post">
    <input type="hidden" name="id" value="${product.id}"/>
    Name: <input type="text" name="name" value="${product.name}" required/><br/>
    Description: <input type="text" name="description" value="${product.description}" required/><br/>
    Price: <input type="number" step="0.01" name="price" value="${product.price}" required/><br/>
    Stock: <input type="number" name="stock" value="${product.stock}" required/><br/>
    Category: 
    <select name="category.id">
        <c:forEach var="c" items="${categories}">
            <option value="${c.id}" ${c.id == product.category.id ? 'selected' : ''}>${c.name}</option>
        </c:forEach>
    </select><br/>
    Supplier: 
    <select name="supplier.id">
        <c:forEach var="s" items="${suppliers}">
            <option value="${s.id}" ${s.id == product.supplier.id ? 'selected' : ''}>${s.name}</option>
        </c:forEach>
    </select><br/>
    <button type="submit">Save</button>
</form>
<a href="/products">Back</a>
</body>
</html>