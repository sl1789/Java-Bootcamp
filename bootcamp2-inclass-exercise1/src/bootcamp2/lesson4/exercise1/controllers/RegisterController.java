package bootcamp2.lesson4.exercise1.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bootcamp2.lesson4.exercise1.dao.StudentDAO;
import bootcamp2.lesson4.exercise1.model.Student;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		RequestDispatcher rd = request.getRequestDispatcher("/registrationform");
		
		String name = request.getParameter("studentname");
		String surname = request.getParameter("studentsurname");
		String am = request.getParameter("studentam");
		request.setCharacterEncoding("UTF-8");
		
		if(name.length()<3||surname.length()<3||am.length()<9){
			request.setAttribute("errormessage", "Data not valid");
			rd.forward(request, response);
		}else{
			StudentDAO sd = new StudentDAO();
			
			try {
				sd.saveStudent(new Student(name,surname,am));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			request.setAttribute("message", "Registration completed successfully");
			rd.forward(request, response);
		}
		
		
		/*
		 * You must finish method's body
		 */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
