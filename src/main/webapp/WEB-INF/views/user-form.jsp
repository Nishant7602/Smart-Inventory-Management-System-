<h2>Add / Edit User</h2>

<form action="save" method="post">

    <input type="hidden" name="id" value="${user.id}" />

    Name: <input type="text" name="name" value="${user.name}" required /><br><br>
    Email: <input type="text" name="email" value="${user.email}" required /><br><br>
    Password: <input type="password" name="password" value="${user.password}" required /><br><br>

    Role:
    <select name="role">
        <option value="ADMIN">ADMIN</option>
        <option value="USER">USER</option>
    </select>

    <br><br>

    <button type="submit">Save</button>
</form>