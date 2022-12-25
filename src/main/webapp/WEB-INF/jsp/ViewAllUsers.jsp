<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Insert title here</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>Users list</h2>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Username</th>
						<th scope="col">Password</th>
						<th scope="col">UserType</th>
						<th scope="col">Delete</th>
						<th scope="col">Update</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${usersList}" var="object">
						<tr>
							<td>${object.getId()}</td>
							<td>${object.getUsername()}</td>
							<td>${object.getPassword()}</td>
							<td>${object.getUsertype()}</td>
							<td><a href="deleteUser/${object.id}">Delete</a></td>
							<td><a href="editUser/${object.id}">Update</a></td>
						</tr>
	
	
					</c:forEach>
				</tbody>
			</table>
		</div>
		<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>