package bootcamp2.lesson4.exercise1.dao;

import java.sql.*;
import java.util.ArrayList;
import bootcamp2.lesson4.exercise1.connection.DB;
import bootcamp2.lesson4.exercise1.model.Student;


public class StudentDAO {

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Queries database and returns all registered students in a ArrayList
	 * 
	 * @return ArrayList<Student>
	 * @throws Exception
	 */
	public ArrayList<Student> getStudents() throws Exception {

		DB db = new DB();
		Connection con = null;
		//con = db.getConnection();
		ResultSet rs =null;
		Statement st = null;
		String sqlquery = "SELECT * FROM exercise1_student;";
		ArrayList<Student> results= new ArrayList<Student>();
		
		try{
			
			db.open();
			con = db.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sqlquery);
			while(rs.next()){
				results.add(new Student(rs.getString("name"),rs.getString("surname"),rs.getString("am")));
			}
			rs.close();
			st.close();
			db.close();
			
			return results;
			
		}catch(Exception e){
			throw new Exception("An error occured while getting students from database: " + e.getMessage());
		}finally {
			
			try {
				db.close();
			} catch (Exception e) {
				
			} 
			
		}	
		
		
		
		
	}//End of getStudents

	/**
	 * Saves student in the database
	 * 
	 * @param student, Student
	 * @throws Exception
	 */
	public void saveStudent(Student student) throws Exception {

		
		DB db = new DB();
		Connection con = null;
		PreparedStatement st = null;
		String sqlq = "Insert into exercise1_student values(?,?,?);";
		try{
			db.open();
			con=db.getConnection();
			st=con.prepareStatement(sqlq);
			st.setString(1, student.getName());
			st.setString(2, student.getSurname());
			st.setString(3, student.getAm());
			st.executeUpdate();
			st.close();
			db.close();
		}catch(Exception e){
			throw new Exception("An error occured while getting students from database: " + e.getMessage());
		}finally{
			try {
				db.close();
			} catch (Exception e) {
				
			} 
		}
		
		
	}//End of saveStudent	
	
}//End of class
