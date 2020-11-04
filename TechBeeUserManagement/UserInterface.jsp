
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <!-- Bootstrap CSS -->
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 
<!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
 
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">
 
<meta charset="ISO-8859-1">
<title>USER DETAILS
</title>

</head>

<body>
    <div class="card card-info">
            <div class="card-header" style="background-color: aqua;">
              <h3 class="card-title">USERS</h3>
            </div>
            <div class="card-body p-0">
              <table class="table">
                <thead>
                  <tr>
                    <th>UserID</th>
                    <th>Name</th>
                    <th>Password</th>
                    <th>Email-ID</th>
                    <th>Country</th>
                    
                    <th></th>
                  </tr>
                </thead>
                <tbody>

           
                  <%@page import="com.classes.users.UsersDataBase"%>
                  <%@page import="com.classes.users.Users"%>
                  <%@page import="java.util.List"%>
                  
                  <%     
                  		List<Users> list=UsersDataBase.getAllEmployees();
                  %>
                  
                  
                  <%
                  for(Users e:list){  
                   
                    out.println("<tr>");
                    out.println("<td>"+e.getId()+"</td>");
                    out.println("<td>"+e.getName()+"</td>");
                    out.println("<td>"+e.getPassword()+"</td>");
                    out.println("<td>"+e.getEmail()+"</td>");
                    out.println("<td>"+e.getCountry()+"</td>");
                    out.println("<td class=\"text-right py-0 align-middle\">");
                    out.println("<div class=\"btn-group btn-group-sm\">");
                    out.println("<a href='DeleteServlet?id="+e.getId()+"'");
                    out.println("class=\"btn btn-danger\">");
                    out.println("<i class=\"fas fa-trash\"></i></a>");
                    //out.println("<a href='DeleteServlet?id="+e.getId()+"' class="btn btn-danger"><i class="fas fa-trash"></i></a>");
                    out.println("</div>");
                  out.println("</td>");
                  }
                  %>
                  
                </tbody>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
          <!-- /.card -->
       
      <div class="row">
        <div class="col-12">
          <a href="#" class="btn btn-secondary">Cancel</a>
          <input type="submit" value="Save Changes" class="btn btn-success float-right">
        </div>
      </div>
      
      <!-- jQuery -->
<script src="../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../../dist/js/demo.js"></script>
</body>
</html>
