<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Analytics Dashboard</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: auto;
        }
        .card {
            background: white;
            padding: 20px;
            margin: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
            display: inline-block;
            width: 25%;
            text-align: center;
        }
        h2 {
            color: #333;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Analytics Dashboard</h1>

    <div class="card">
        <h2>Total Products</h2>
        <p>${totalProducts}</p>
    </div>

    <div class="card">
        <h2>Total Orders</h2>
        <p>${totalOrders}</p>
    </div>

    <div class="card">
        <h2>Total Revenue</h2>
        <p>${totalRevenue}</p>
    </div>

</div>

</body>
</html>