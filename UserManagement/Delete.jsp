<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<title>
	DELETE USER
</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <body>
    	<div class="container">
    	<div class="page-header">
    	<h1 class="text-info">DELETE USER <small> (USERS CAN BE REMOVED) </small></h1>
    	</div>
    	<div class="jumbotron">
    	<form action="DELETE">
    		
    		<div class="container">
    				<div class="row">
    						<div class="col-md-4">
    								<div class="form-group">
    									<input type="text" name="user_name" placeholder="ENTER USER NAME" class="form-control">
    										</div>
    										<br>	
    										<div class="form-group">
    									<input type="submit" value="DELETE" class="btn btn-primary" class="form-control">
									</div>    				
    						</div>
    				</div>
    		</div>
    	</form>
    	</div>
    	</div>
    </body>
</html>
