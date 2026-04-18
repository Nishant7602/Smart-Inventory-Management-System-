<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add Billing</title>
    <style>
        body {
            font-family: Arial;
        }
        form {
            width: 400px;
            margin: 50px auto;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
        }
        button {
            padding: 10px;
            background-color: green;
            color: white;
            border: none;
        }
    </style>
</head>
<body>

<h2 style="text-align:center;">Add Billing</h2>

<form action="${pageContext.request.contextPath}/billing/save" method="post">

    <label>Customer Name:</label>
    <input type="text" name="customerName" required/>

    <label>Amount:</label>
    <input type="number" name="totalAmount" required/>

    <label>Date:</label>
    <input type="date" name="orderDate" required/>

    <button type="submit">Save</button>

</form>

</body>
</html>