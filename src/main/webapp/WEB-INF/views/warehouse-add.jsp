<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add Warehouse</title>

    <!-- Bootstrap CDN -->
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        body {
            background-color: #f4f6f9;
        }
        .card {
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
        }
        .form-control {
            border-radius: 8px;
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
            border-radius: 8px;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>

<div class="container mt-5">

    <div class="card p-4">
        <h3 class="text-center mb-4">🏬 Add Warehouse</h3>

        <form:form action="save" method="post" modelAttribute="warehouse">

            <div class="mb-3">
                <label class="form-label">Warehouse Name</label>
                <form:input path="name" cssClass="form-control" placeholder="Enter warehouse name"/>
            </div>

            <div class="mb-3">
                <label class="form-label">Location</label>
                <form:input path="location" cssClass="form-control" placeholder="Enter location"/>
            </div>

            <div class="mb-3">
                <label class="form-label">Capacity</label>
                <form:input path="capacity" cssClass="form-control" placeholder="Enter capacity"/>
            </div>

            <div class="mb-3">
                <label class="form-label">Manager Name</label>
                <form:input path="managerName" cssClass="form-control" placeholder="Enter manager name"/>
            </div>

            <div class="mb-3">
                <label class="form-label">Contact Number</label>
                <form:input path="contact" cssClass="form-control" placeholder="Enter contact number"/>
            </div>

            <div class="text-center">
                <button type="submit" class="btn btn-custom px-4">Save</button>
                <a href="list" class="btn btn-secondary px-4">Cancel</a>
            </div>

        </form:form>
    </div>

</div>

</body>
</html>