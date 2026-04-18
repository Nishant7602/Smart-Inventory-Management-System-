<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Invoice</title>
</head>
<body>

<h2>Add Invoice</h2>

<form action="saveInvoice" method="post">

    Invoice Number: <input type="text" name="invoiceNumber"/><br><br>
    
    Customer Name: <input type="text" name="customerName"/><br><br>
    
    Amount: <input type="text" name="totalPrice"/><br><br>
    
    Date: <input type="date" name="date"/><br><br>

    <input type="submit" value="Save Invoice"/>

</form>

</body>
</html>