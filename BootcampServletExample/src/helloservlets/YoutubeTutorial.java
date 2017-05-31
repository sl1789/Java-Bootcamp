package helloservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;//imports the @WebServlet that helps direct the action
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YoutubeTutorial
 */
@WebServlet("/YoutubeTutorial")
public class YoutubeTutorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usersName = request.getParameter("Your Name");
		String lang = request.getParameter("Language");
		int firstNum = Integer.parseInt(request.getParameter("FirstNum"));
		int secondNum = Integer.parseInt(request.getParameter("SecondNum"));
		int sumONum = firstNum + secondNum;
		
		response.setContentType("text/html");
		PrintWriter output= response.getWriter();//return a printwriter that can write in my browser
		output.println("<html><body><h3>Hello "+usersName);
		output.println("</h3><br />" + firstNum + " + " + secondNum);
		output.println(" = " + sumONum + "<br />Speaks " + lang + "</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
