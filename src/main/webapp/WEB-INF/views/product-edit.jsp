<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Edit Product</title>
</head>
<body>

<h2>Edit Product</h2>

<form:form action="update" method="post" modelAttribute="product">

    <!-- IMPORTANT: ID must be hidden -->
    <form:hidden path="id"/>

    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td>Price:</td>
            <td><form:input path="price"/></td>
        </tr>

        <tr>
            <td>Quantity:</td>
            <td><form:input path="quantity"/></td>
        </tr>

        <tr>
            <td>Description:</td>
            <td><form:input path="description"/></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Update"/>
            </td>
        </tr>
    </table>

</form:form>

<br/>
<a href="list">Back to Product List</a>

</body>
</html>