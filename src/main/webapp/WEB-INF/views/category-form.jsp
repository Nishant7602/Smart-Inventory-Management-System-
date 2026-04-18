<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Category Form</title>

    <style>
        body {
            font-family: Arial;
            background: #f4f6f9;
        }

        .container {
            width: 40%;
            margin: 50px auto;
            background: white;
            padding: 25px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input, textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
        }

        .btn {
            margin-top: 20px;
            padding: 10px;
            width: 100%;
            border: none;
            color: white;
            background: #007bff;
            border-radius: 5px;
            cursor: pointer;
        }

        .back-btn {
            margin-top: 10px;
            display: block;
            text-align: center;
            text-decoration: none;
        }
    </style>
</head>

<body>

<div class="container">

    <h2>📂 Category Form</h2>

    <form action="${pageContext.request.contextPath}/categories/save" method="post">

        <!-- Hidden ID for Edit -->
        <input type="hidden" name="id" value="${category.id}" />

        <label>Category Name:</label>
        <input type="text" name="name" value="${category.name}" required />

        <label>Description:</label>
        <textarea name="description" rows="4">${category.description}</textarea>

        <button type="submit" class="btn">Save Category</button>

    </form>

    <a href="${pageContext.request.contextPath}/categories" class="back-btn">
        ⬅ Back to List
    </a>

</div>

</body>
</html>