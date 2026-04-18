<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-4">
    <h1>Analytics Dashboard</h1>
    <div class="row mt-4">
        <div class="col-md-3">
            <div class="card text-white bg-primary mb-3">
                <div class="card-header">Total Revenue</div>
                <div class="card-body">
                    <h4>$${totalRevenue}</h4>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card text-white bg-success mb-3">
                <div class="card-header">Total Invoices</div>
                <div class="card-body">
                    <h4>${totalInvoices}</h4>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card text-white bg-warning mb-3">
                <div class="card-header">Total Products</div>
                <div class="card-body">
                    <h4>${totalProducts}</h4>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card text-white bg-danger mb-3">
                <div class="card-header">Low Stock</div>
                <div class="card-body">
              
                        
                            <h4>${lowStock}</h4>
                       
                    
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>