<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>View all vendor category</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>Users list</h2>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Vendor Category</th>
						<th scope="col">Delete</th>
						<th scope="col">Update</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorCategories}" var="venCat">
						<tr>
							<td>${venCat.getVendorCategoryId()}</td>
							<td>${venCat.getVendorCategoryName()}</td>
							<td><a class="btn btn-outline-danger" href="deleteVenCat/${venCat.getVendorCategoryId()}">Delete</a></td>
							<td><a class="btn btn-outline-dark" href="editVenCat/${venCat.getVendorCategoryId()}">Update</a></td>
						</tr>
	
	
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>