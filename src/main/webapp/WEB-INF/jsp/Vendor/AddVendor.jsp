<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Add Vendor</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
	         	<div class ="container">
	                <div class="col-lg-4 mx-auto card form-container">
	                    <form method="post" action="/Vendor/">
	                        <div class="d-flex justify-content-center form-header">
	                          <h1>Add Vendor</h1>
	                        </div>
	                        <hr>
	                        <h4>Address</h4>
	                        
	                        <div class="form-floating mb-3">
	                          <input type="text" id="houseName" name="houseName" class="form-control" placeholder="Enter the House Name">
	                          <label for="houseName" class="form-label">House name</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="street" name="street" class="form-control" placeholder="Enter the Street name">
	                          <label for="street" class="form-label">Street</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="postOffice" name="postOffice" class="form-control" placeholder="Enter the post office name">
	                          <label for="postOffice" class="form-label">Post Office</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="district" name="district" class="form-control" placeholder="Enter the district name">
	                          <label for="district" class="form-label">District</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="state" name="state" class="form-control" placeholder="Enter the name of the state">
	                          <label for="state" class="form-label">State</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="number" id="pinCode" name="pinCode" class="form-control" placeholder="Enter the PIN code">
	                          <label for="state" class="form-label">PIN Code</label>
	                        </div>
							<hr>
	                        <div class="mb-3">
								<input hidden type="text" id="vendorCategoryId" name="vendorCategoryId" value="">
	                            <label class="form-label">Select Vendor Category</label>
	                            <select class="form-select" name="vendorCategoryName" aria-label="usertype" id="vendorCategoryName">
	                                
	                            </select>
	                        </div>
	                        <hr>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="vendorName" name="vendorName" class="form-control" placeholder="Enter the Vendor Name">
	                          <label for="vendorName" class="form-label">Vendor Name</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="password" id="vendorPassword" name="vendorPassword" class="form-control" placeholder="Enter the Vendor Password">
	                          <label for="vendorPassword" class="form-label">Vendor Password</label>
	                        </div>
							<div class="mb-3">
								<label class="form-label">Select Vendor Category</label>
	                            <select class="form-select" name="vendorUserType" aria-label="usertype" id="vendorUserType">
	                                
	                            </select>
	                        </div>
	                        <div class="d-grid gap-2 mx-auto">
	                          <button type="submit" id="user-submit" class="btn btn-outline-primary btn-lg">Add Vendor</button>
	                        </div> 
	                    </form>
	                    
	                </div>
	            </div>
	        </section>
		</main>
		<script src="/js/AddVendor.js"></script>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>