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
						<th scope="col">Vendor Username</th>
						<th scope="col">Vendor Password</th>
						<th scope="col">Vendor UserType</th>
						<th scope="col">Address</th>
						<th scope="col">Vendor Category</th>
						<th scope="col">Delete</th>
						<th scope="col">Update</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vendorsList}" var="object">
						<tr>
							<td>${object.getVendorId()}</td>
							<td>${object.getVendorName()}</td>
							<td>${object.getVendorPassword()}</td>
							<td>${object.getVendorUserType()}</td>
							<td>
								${object.getAddress().getHouseName()},
								${object.getAddress().getStreet()},
								${object.getAddress().getPostOffice()},
								${object.getAddress().getDistrict()},
								${object.getAddress().getState()},
								${object.getAddress().getPinCode()}
							</td>
							<td>${object.getVendorCategory().getVendorCategoryName()}</td>
							<td><a href="deleteUser/${object.getVendorId()}">Delete</a></td>
							<td><a href="editUser/${object.getVendorId()}">Update</a></td>
						</tr>
	
	
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>