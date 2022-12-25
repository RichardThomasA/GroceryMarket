<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Login</title>
		<link href="./css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
				<div class="container">
					<div class="col-lg-3 mx-auto card form-container">
						<form action="/login" method ="post">
							<div class="form-header justify-content-center d-flex">
								<h1>Login</h1>
							</div>
							<div class="form-floating mb-3">
	                          <input type="text" id="login-username" name="login-username" class="form-control" placeholder="Enter your username">
	                          <label for="login-username" class="form-label">Username</label>
	                        </div>
							<div class="form-floating mb-3">
	                          <input type="password" id="login-password" name="login-password" class="form-control" placeholder="Enter your password">
	                          <label for="login-password" class="form-label">Password</label>
	                        </div>
	                        <div class="d-grid gap-2 mx-auto">
	                          <button type="submit" id="login-submit" class="btn btn-outline-primary btn-lg">Login</button>
	                        </div> 
						</form>
					</div>
				</div>
				
			</section>
		</main>
		<script src="./js/bootstrap/bootstrap.js"></script>
	</body>
</html>