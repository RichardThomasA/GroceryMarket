<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Error page</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
				<div class="container">
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class=breadcrumb-item>
								<a href = "<%= request.getAttribute("prevPage") %>"><%= request.getAttribute("prevPage") %></a>
							</li>
						</ol>
					</nav>
					<div class="alert alert-danger" role="alert">
						<%= request.getAttribute("error") %>
					</div>
				</div>
			</section>
		</main>
	<script src="/js/bootstrap/bootstrap.bundle.js"></script>
	</body>
</html>