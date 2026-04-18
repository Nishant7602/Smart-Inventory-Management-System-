<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>User List</h2>

<a href="add">Add New User</a>
<a href="../user/logout">Logout</a>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Role</th>
        <th>Action</th>
    </tr>

    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.role}</td>
            <td>
                <a href="edit?id=${u.id}">Edit</a> |
                <a href="delete?id=${u.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>

</table>