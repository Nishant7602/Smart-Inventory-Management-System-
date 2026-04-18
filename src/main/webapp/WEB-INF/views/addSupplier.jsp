<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Supplier</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
        }

        .container {
            width: 400px;
            margin: 60px auto;
            background: white;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 6px 18px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0 15px;
            border-radius: 6px;
            border: 1px solid #ccc;
        }

        .btn {
            width: 100%;
            padding: 10px;
            background: linear-gradient(45deg, #28a745, #5cd65c);
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 15px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover {
            background: linear-gradient(45deg, #218838, #4cd137);
        }

        .back-btn {
            display: block;
            text-align: center;
            margin-top: 10px;
            text-decoration: none;
            color: #007bff;
        }

        .back-btn:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>➕ Add Supplier</h2>

    <form action="${pageContext.request.contextPath}/supplier/saveSupplier" method="post">

        <label>Supplier Name</label>
        <input type="text" name="name" required />

        <label>Email</label>
        <input type="email" name="email" required />

        <label>Phone</label>
        <input type="text" name="phone" required />

        <label>Address</label>
        <input type="text" name="address" required />

        <button type="submit" class="btn">Save Supplier</button>

    </form>

    <a href="${pageContext.request.contextPath}/supplier/list" class="back-btn">
        ← Back to Supplier List
    </a>
</div>

</body>
</html>