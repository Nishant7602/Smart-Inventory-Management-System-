<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Generate Invoice</title>
</head>
<body>

<h2>Generate Invoice</h2>

<form action="${pageContext.request.contextPath}/supplier/addInvoice" method="get">

    <!-- Product ID -->
    Product ID:
    <input type="text" name="product.id" required />
    <br><br>

    <!-- Warehouse ID -->
    Warehouse ID:
    <input type="text" name="warehouse.id" required />
    <br><br>

    <!-- User ID -->
<select name="user.id">
    <option value="1">Admin</option>
    <option value="2">John</option>
</select><br><br>
    <!-- Quantity -->
    Quantity:
    <input type="number" name="quantity" required />
    <br><br>

    <!-- Total Price -->
    Total Price:
    <input type="number" step="0.01" name="totalPrice" required />
    <br><br>

    <input type="submit" value="Generate Invoice" />

</form>

</body>
</html>