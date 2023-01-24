<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>View all Vendors</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>Vendors list</h2>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Vendor Name</th>
						<th scope="col">Invoice Number</th>
						<th scope="col">Stock Date</th>
						<th scope="col">Item Name</th>
						<th scope="col">Item Category</th>
						<th scope="col">Quantity</th>
						<th scope="col">Unit Of Measurement</th>
						<th scope="col">Vendor Price/Unit</th>
						<th scope="col">Retail Price/Unit</th>
						<th scope="col">Delete</th>
						<th scope="col">Update</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${stockItemList}" var="stockItem">
						<tr>
							<td>${stockItem.getStockItemId()}</td>
							<td>${stockItem.getStock().getVendor().getVendorName()}</td>
							<td>${stockItem.getStock().getStockInvoiceNumber()}</td>
							<td>${stockItem.getStock().getStockDate()}</td>
							<td>
								${stockItem.getItem().getItemName()}
							</td>
							<td>${stockItem.getItem().getStockCategory().getItemCategoryName()}</td>
							<td>${stockItem.getQuantity()}</td>
							<td>${stockItem.getUnitOfQuantity()}</td>
							<td>${stockItem.getVendorQuotedPrice().getVendorPrice()}</td>
							<td>${stockItem.getProductRetailPrice().getRetailPrice()}</td>
							<td><a href="deleteUser/${stockItem.getStockItemId()}">Delete</a></td>
							<td><a href="editUser/${stockItem.getStockItemId()}">Update</a></td>
						</tr>
	
	
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>