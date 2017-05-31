package bootcamp2.lesson4.exercise1.views;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentFormServlet
 */
@WebServlet("/registrationform")
public class StudentFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = new PrintWriter(response.getWriter());
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("  <head>");
		out.println("    <meta charset='utf-8'>");
		out.println("    <meta http-equiv='X-UA-Compatible' content='IE=edge'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1'>");
		out.println("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->");
		
		out.println("    <meta name='description' content='Student registration page'>");
		out.println("    <meta name='author' content='sofos@aueb.gr'>    ");
		
		out.println("    <title>Student Registration: register.html</title>");
		out.println("    <!-- Bootstrap core CSS -->");
		out.println("    <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>   ");
		out.println("    <!-- Custom styles for this template -->");
		out.println("    <link href='css/style.css' rel='stylesheet'>  ");
		
		out.println("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
		out.println("    <!--[if lt IE 9]>");
		out.println("      <script src='https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js'></script>");
		out.println("      <script src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js'></script>");
		out.println("    <![endif]-->");
		out.println("  </head>");
		out.println("  <body>");
		out.println("    <!-- Fixed navbar -->");
		out.println("    <nav class='navbar navbar-inverse navbar-fixed-top'>");
		out.println("      <div class='container'>");
		out.println("        <div class='navbar-header'>");
		out.println("          <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#navbar' aria-expanded='false' aria-controls='navbar'>");
		out.println("            <span class='sr-only'>Toggle navigation</span>");
		out.println("            <span class='icon-bar'></span>");
		out.println("            <span class='icon-bar'></span>");
		out.println("            <span class='icon-bar'></span>");
		out.println("          </button>");
		out.println("          <a class='navbar-brand' href='#'>LESSON 4</a>");
		out.println("        </div>");
		out.println("        <div id='navbar' class='navbar-collapse collapse'>");
		out.println("          <ul class='nav navbar-nav'>");
		out.println("            <li class='active'><a href='registrationform'>Register</a></li>                      ");
		out.println("            <li><a href='students'>Students</a></li>                      ");
		out.println("          </ul>");
		out.println("        </div><!--/.nav-collapse -->");
		out.println("      </div>");
		out.println("    </nav>");
		
		out.println("    <div class='container theme-showcase' role='main'>");
		
		out.println("		<!-- Main jumbotron for a primary marketing message or call to action -->");
		out.println("		<div class='jumbotron'>");
		out.println("			<h1>LESSON 4</h1>			");
		out.println("		</div>");
		
		out.println("		<div class='page-header'>");
		out.println("			<h1>Φόρμα Εγγραφής</h1>");
		out.println("		</div>");
		
		if(request.getAttribute("message") != null) {
			
			out.println("		<div class='alert alert-success' role='alert'>");
			out.println("			<p class='text-center'>" + (String)request.getAttribute("message") + "</p>");
			out.println("		</div>");
		}
		
		if(request.getAttribute("errormessage") != null) {
			
			out.println("		<div class='alert alert-danger' role='alert'>");
			out.println("			<p class='text-center'>" + (String)request.getAttribute("errormessage") + "</p>");
			out.println("		</div>");
		}
				
		out.println("		<form class='form-horizontal' method='GET' action='register'>");
		out.println("			  <div class='form-group'>");
		out.println("				<label for='sname' class='col-sm-2 control-label'>Όνομα</label>");
		out.println("				<div class='col-sm-6'>");
		out.println("				  <input type='text' name='studentname' class='form-control' id='sname' placeholder='το όνομα σου'>");
		out.println("				</div>");
		out.println("			  </div>");
		out.println("			  <div class='form-group'>");
		out.println("				<label for='surname' class='col-sm-2 control-label'>Επώνυμο</label>");
		out.println("				<div class='col-sm-6'>");
		out.println("				  <input type='text' name='studentsurname' class='form-control' id='surname' placeholder='το επώνυμο σου'>");
		out.println("				</div>");
		out.println("			  </div>");
		out.println("			  <div class='form-group'>");
		out.println("				<label for='am' class='col-sm-2 control-label'>Αρ.Μητρώου</label>");
		out.println("				<div class='col-sm-6'>");
		out.println("				  <input type='text' name='studentam' class='form-control' id='am' placeholder='ο Αριθμός Μητρώου σου'>");
		out.println("				</div>");
		out.println("			  </div>");
		out.println("			  <div class='form-group'>");
		out.println("				<div class='col-sm-offset-2 col-sm-6'>");
		out.println("				  <button type='submit' class='btn btn-success'>Καταχώρηση</button>");
		out.println("				</div>");
		out.println("			  </div>");
		out.println("		</form>  ");
		out.println("    </div> <!-- /container -->");
		
		out.println("	<!-- footer -->");
		out.println("	<footer class='navbar-inverse'>");
		out.println("		<div class='container'>");
		out.println("			<div class='row'>             ");
		out.println("				<div class='col-xs-12'>");
		out.println("					<p class='text-center'>&copy; 2017 by 'INSERT YOUR NAME'</p>");
		out.println("				</div>");
		out.println("			</div>");
		out.println("		</div>");
		out.println("	</footer>");
		out.println("	<!-- End footer -->");
		
		out.println("    <!-- Bootstrap core JavaScript");
		out.println("    ================================================== -->");
		out.println("    <!-- Placed at the end of the document so the pages load faster -->");
		out.println("    <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js'></script>");
		out.println("    <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>    ");
		out.println("  </body>");
		out.println("</html>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
