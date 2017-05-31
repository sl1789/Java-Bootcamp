package bootcamp2.lesson4.exercise1.views;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bootcamp2.lesson4.exercise1.dao.StudentDAO;
import bootcamp2.lesson4.exercise1.model.Student;


/**
 * Servlet implementation class ViewStudentsServlet
 */
@WebServlet("/students")
public class ViewStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = new PrintWriter(response.getWriter());
			
		StudentDAO sd =new StudentDAO();
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("  <head>");
		out.println("    <meta charset='utf-8'>");
		out.println("    <meta http-equiv='X-UA-Compatible' content='IE=edge'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1'>");
		out.println("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->");
		
		out.println("    <meta name='description' content='Students page'>");
		out.println("    <meta name='author' content=''>    ");
		
		out.println("    <title>Students list</title>");
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
		out.println("            <li><a href='registrationform'>Register</a></li>                      ");
		out.println("            <li class='active'><a href='students'>Students</a></li>                      ");
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
		out.println("			<h1>Εγγεγραμμένοι Φοιτητές</h1>");
		out.println("		</div>");
		
		out.println("		<div class='row'>");
		out.println("			<div class='col-xs-12'>");
		
		out.println("          		<div class='table-responsive'>");
		out.println("            		<table class='table table-striped table-bordered table-hover table-condensed'>");
		out.println("              			<tr class='warning'>");
		out.println("              				<th>ΑΦΜ</th><th>Όνομα</th><th>Επώνυμο</th>");
		out.println("              			</tr>");
		try {
			ArrayList<Student> arr=sd.getStudents();
			if(arr.size()>0){
			for(int i =0; i<arr.size();i++){
				out.println("              			<tr>");
				out.println("              				<td>"+arr.get(i).getSurname()+"</td><td>"+arr.get(i).getAm()+"</td><td>"+arr.get(i).getName()+"</td>");
				out.println("              			</tr>");
			}}else{
				out.println("              			<tr>");
				out.println("              			<th colspan='3'>No registered students found</th>");
				out.println("              			</tr>");
			}
		} catch (Exception e) {
		
		}

		/*out.println("              			<tr>");
		out.println("              				<td>-</td><td>-</td><td>-</td>");
		out.println("              			</tr>");*/
		
		out.println("          			</table>");
		out.println("          		</div>");
		out.println("			</div>");
		out.println("		</div>");
			
				
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
