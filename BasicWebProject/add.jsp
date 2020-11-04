<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='yellow'>

<h1>         OPERATION EXECUTED </h1>

<%!
String msg="PERFORMED ADDITION FUNCTIONALTY";
%>

<%

int a=Integer.parseInt(request.getParameter("one"));
int b=Integer.parseInt(request.getParameter("two"));

int r=a+b;

out.println("RESULT => "+r+"\n");

%>

<%= msg  %>

</body>
</html>
