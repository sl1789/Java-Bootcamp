<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ page errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Student registration page">
    <meta name="author" content="sofos@aueb.gr">
<title>Logout page</title>
<!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
    <!-- Custom styles for this template -->
    <link href="css/mystyle.css" rel="stylesheet"> 
</head>
<body>
	<%@ include file="navigation_menu.jsp"  %>
	<%session.invalidate(); %>
	<div class="alert alert-danger" role="alert">
				<p class="text-center"><%out.print("Η έξοδος πραγματοποίηθηκε με επιτυχία"); %></p>
			</div>
	

</body>
</html>