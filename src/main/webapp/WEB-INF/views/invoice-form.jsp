<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Add Invoice</h2>

<form action="${pageContext.request.contextPath}/invoice/save" method="post">

    <input type="hidden" name="id" value="${invoice.id}" />

    <label>Product ID:</label>
    <input type="text" name="product.id" required />

    <label>Quantity:</label>
    <input type="number" name="quantity" required />

    <label>Price:</label>
    <input type="number" step="0.01" name="price" required />

    <button type="submit">Save</button>
</form>