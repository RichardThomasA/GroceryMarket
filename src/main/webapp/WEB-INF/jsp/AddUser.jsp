<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Add User</title>
		<link href="/css/bootstrap/bootstrap.css" rel="stylesheet">
	</head>
	<body>
		<main>
			<section>
	         	<div class ="container">
	                <div class="col-lg-4 mx-auto card form-container">
	                    <form method="post" action="/user/saveUser">
	                        <div class="d-flex justify-content-center form-header">
	                          <h1>Add User</h1>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="username" name="username" class="form-control" placeholder="Enter the username">
	                          <label for="username" class="form-label">Username</label>
	                        </div>
	                        <div class="form-floating mb-3">
	                          <input type="text" id="password" name="password" class="form-control" placeholder="Enter the password">
	                          <label for="password" class="form-label">Password</label>
	                        </div>
	                        <div class="mb-3">
	                            <label class="form-label">Select Usertype</label>
	                            <select class="form-select" name="usertype" aria-label="usertype" id="usertype">
	                                
	                            </select>
	                        </div>
	                        <div class="d-grid gap-2 mx-auto">
	                          <button type="submit" id="user-submit" class="btn btn-outline-primary btn-lg">Add User</button>
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