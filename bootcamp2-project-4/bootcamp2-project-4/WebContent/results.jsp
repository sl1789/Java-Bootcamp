<%-- TASK 3 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="org.afdemp.bootcamp2.lesson5.project.domain.Student"%>
<%@ page errorPage="error.jsp"%>
<%@ page import="org.afdemp.bootcamp2.lesson5.project.domain.User" %>

<%
ArrayList<Student> arr = (ArrayList<Student>)request.getAttribute("students-results");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Αποτελέσματα αναζήτησης</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Custom styles for this template -->
<link href="css/mystyle.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<% User user = (User)session.getAttribute("user-object");%>
  <% String name = user.getUsername(); %>
	<jsp:include page="navigation_menu.jsp"></jsp:include>

	<div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Hello <%= name %></h1>
		</div>

		<div class="page-header">
			<h1>Αποτελέσματα αναζήτησης<% if (arr != null && arr.size() > 0) { %>
	
				<span class="badge"><%=arr.size() %></span>
				
<% } %></h1>
		</div>
		

		<div class="table-responsive">
		
			<table class="table table-condensed table-hover table-bordered table-striped">
				<tr class="warning">
					<th>Αρ.Μητρώου</th>
					<th>Όνομα</th>
					<th>Επώνυμο</th>
				</tr>
				
				<% if (arr == null || arr.size() == 0) { %>
						<tr>
							<td colspan="3" class="bg-danger text-center">
								No results found using: &apos;<b><%=request.getParameter("surname") %></b>&apos;
							</td>
						</tr>
						
				
			<% }else{for (Student student : arr){%>	
				<tr>
					<td><%=student.getAm() %></td>
					<td><%=student.getName() %></td>
					<td><%=student.getSurname() %></td>
				</tr>					
			<%  }} %>	
			</table>
		</div>
	</div>
	<!-- /container -->

	
	<!-- footer -->
	<footer class="navbar-inverse">
		<div class="container">
			<div class="row">             
				<div class="col-xs-12">
					<p class="text-center">&copy; Copyright 2017</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- End footer -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
</body>
</html>