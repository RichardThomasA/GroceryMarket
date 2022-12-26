<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Add Vendor Category</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
	         	<div class ="container">
	                <div class="col-lg-4 mx-auto card form-container">
	                    <form method="post" action="/vendorCategory/save">
	                        <div class="d-flex justify-content-center form-header">
	                          <h1>Add Vendor Category</h1>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="vendorCategoryName" name="vendorCategoryName" class="form-control" placeholder="Enter the username">
	                          <label for="vendorCategoryName" class="form-label">Vendor Category</label>
	                        </div>
	                        <div class="d-grid gap-2 mx-auto">
	                          <button type="submit" id="vendor-category-submit" class="btn btn-outline-primary btn-lg">Add Vendor Category</button>
	                        </div> 
	                    </form>
	                    
	                </div>
	            </div>
	        </section>
		</main>
		<script src="/js/AddUser.js"></script>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>