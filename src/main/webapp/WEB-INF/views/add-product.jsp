<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>

<h2>Add Product</h2>

<form action="saveProduct" method="post">
    Name: <input type="text" name="name"/><br><br>
    Price: <input type="totalPrice" name="price"/><br><br>
    Quantity: <input type="text" name="stock"/><br><br>

    <input type="submit" value="Save Product"/>
</form>

</body>
</html>