<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Add Stock</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
	         	<div class ="container">
	                <div class="col-lg-4 mx-auto card form-container">
	                    <form method="post" action="/Vendor/">
	                        <div class="d-flex justify-content-center form-header">
	                          <h1>Add Stock Item</h1>
	                        </div>
	                        <hr>
	                        <h4>Item</h4>
	                        
	                        <div class="mb-3">
								<label class="form-label">Select Item Category</label>
	                            <select class="form-select" name="itemCategory" aria-label="usertype" id="itemCategory">
	                                
	                            </select>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="itemName" name="itemName" class="form-control" placeholder="Enter the Item name">
	                          <label for="street" class="form-label">Item Name</label>
	                        </div>

							<hr>
	                        <h4>Stock</h4>
							<div class="mb-3">
								<label class="form-label">Select Vendor Supplying Stock</label>
	                            <select class="form-select" name="vendor" aria-label="usertype" id="vendor">
	                                
	                            </select>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="stockInvoiceNumber" name="stockInvoiceNumber" class="form-control" placeholder="Enter the invoice number">
	                          <label for="stockInvoiceNumber" class="form-label">Stock Invoice Number</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="date" id="stockDate" name="stockDate" class="form-control" placeholder="Enter the stock date">
	                          <label for="stockDate" class="form-label">Stock Date</label>
	                        </div>

							<hr>
	                        <h4>Stock Details</h4>
	                        <div class="form-floating mb-3">
	                          <input type="number" id="quantity" name="quantity" class="form-control" placeholder="Enter the Quantity">
	                          <label for="quantity" class="form-label">Quantity</label>
	                        </div>
							<div class="mb-3">
								<label class="form-label">Unit Of Quantity</label>
	                            <select class="form-select" name="unitOfQuantity" aria-label="unitOfQuantity" id="unitOfQuantity">
	                                
	                            </select>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="number" id="pinCode" name="pinCode" class="form-control" placeholder="Enter the PIN code">
	                          <label for="state" class="form-label">Vendor Quoted Price Per Unit</label>
	                        </div>
							
	                        <div class="d-grid gap-2 mx-auto">
	                          <button type="submit" id="user-submit" class="btn btn-outline-primary btn-lg">Add Stock Item</button>
	                        </div> 
	                    </form>
	                    
	                </div>
	            </div>
	        </section>
		</main>
		<script src="/js/AddStock.js"></script>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>