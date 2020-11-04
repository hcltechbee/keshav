<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFIRM TO DELETE</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<body>
<div class="container">
		<div class="page-header">
    		<h1 class="text-info"> CONFIRM TO DELETE USER <small> (STATUS: IN-PROGRESS) </small></h1>
    	</div>
    	<div class="container">
    	<div class="from-group">
    	<form action="delete.jsp">
    			<input type="submit" value="NO, Don't Delete User" class="btn btn-primary" class="form-control">
    	</form>
    	</div>
    	</div>
    	
    	<br>
    	
    	<div class="container">
    	<div class="from-group">
    	<form action="deleted">
    			<input type="submit" value="Yes, Delete user " class="btn btn-primary" class="form-control">
    	</form>
    	</div>
    	</div>
    </div>	
</body>
</html>
