<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Add User</title>
</head>
<body>

<h2>Add User</h2>

<form:form action="save" method="post" modelAttribute="user">

    <table>
        <tr>
            <td>Username:</td>
            <td><form:input path="username"/></td>
        </tr>

        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
        </tr>

        <tr>
            <td>Role:</td>
            <td>
                <form:select path="role">
                    <form:option value="ADMIN" label="Admin"/>
                    <form:option value="USER" label="User"/>
                </form:select>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>

</form:form>

<br/>
<a href="list">Back to User List</a>

</body>
</html>