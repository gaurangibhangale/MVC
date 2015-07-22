<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Registration</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

		<link href="../CSS/styles.css" rel="stylesheet">
	</head>
	<body>
<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Register</h1>
      </div>
      <div class="modal-body">
      <br>
          <form class="form col-md-12 center-block" action="RegistrationController" method="post">
            <div class="form-group">Name
              <input type="text" class="form-control input-lg" placeholder="name" name="name">
            </div>
            <div class="form-group">Email
              <input type="text" class="form-control input-lg" placeholder="Email" name="email">
            </div>
            
            <div class="form-group">Username
              <input type="text" class="form-control input-lg" placeholder="username" name="username">
            </div>
            <div class="form-group">Password
              <input type="password" class="form-control input-lg" placeholder="Password" name="password">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block" type="submit">Register</button>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
		  </div>	
      </div>
  </div>
  </div>
</div>
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	</body>
</html>