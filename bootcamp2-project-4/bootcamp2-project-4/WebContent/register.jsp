<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp"%>
<%@ page import="org.afdemp.bootcamp2.lesson5.project.domain.User" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Student registration page">
    <meta name="author" content="sofos@aueb.gr">    
    <title>Student Registration</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
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
  	<%@ include file="navigation_menu.jsp"  %>

    <div class="container theme-showcase" role="main">

		<!-- Main jumbotron for a primary marketing message or call to action -->
		<div class="jumbotron">
			<h1>Hello <%= name%></h1>
		</div>

		<div class="page-header">
			<h1>Φόρμα Εγγραφής</h1>
		</div>
		
		<% if(request.getAttribute("message") != null) { %>
					
			<div class="alert alert-success" role="alert">
				<p class="text-center"><%=(String)request.getAttribute("message") %></p>
			</div>
			
		<% }
		
		   if(request.getAttribute("errormessage") != null) {
		%>
			
			<div class="alert alert-danger" role="alert">
				<p class="text-center"><%=(String)request.getAttribute("errormessage") %></p>
			</div>
			
		<%  } %>
      
		<form class="form-horizontal" method="POST" action="register">
			  <div class="form-group">
				<label for="sname" class="col-sm-2 control-label">Όνομα</label>
				<div class="col-sm-6">
				  <input type="text" name="studentname" class="form-control" id="sname" placeholder="το όνομα σου">
				</div>
			  </div>
			  <div class="form-group">
				<label for="surname" class="col-sm-2 control-label">Επώνυμο</label>
				<div class="col-sm-6">
				  <input type="text" name="studentsurname" class="form-control" id="surname" placeholder="το επώνυμο σου">
				</div>
			  </div>
			  
			  <div class="form-group">
				<label for="am" class="col-sm-2 control-label">Αρ.Μητρώου</label>
				<div class="col-sm-6">
				  <input type="text" name="studentam" class="form-control" id="am" placeholder="ο Αριθμός Μητρώου σου">
				</div>
			  </div>
			  
			  <div class="form-group">
				<div class="col-sm-offset-2 col-sm-6">
				  <button type="submit" class="btn btn-success">Καταχώρηση</button>
				</div>
			  </div>
		</form>  
          
    </div> <!-- /container -->
	
	<%@ include file="footer.jsp"  %>
	 
  </body>
</html>    