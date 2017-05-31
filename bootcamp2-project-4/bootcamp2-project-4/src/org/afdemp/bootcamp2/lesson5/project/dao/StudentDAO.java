package org.afdemp.bootcamp2.lesson5.project.dao;

import java.sql.*;
import java.util.ArrayList;


import org.afdemp.bootcamp2.lesson5.project.connection.DB;
import org.afdemp.bootcamp2.lesson5.project.domain.Student;

public class StudentDAO {

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Student> getStudents() throws Exception {

		Connection con = null;
		String sqlquery = "SELECT * FROM student_table;";
		DB db = new DB();
		
		try {
			
			db.open();
			con = db.getConnection();

			PreparedStatement stmt = con.prepareStatement(sqlquery);
			ResultSet rs = stmt.executeQuery();

			ArrayList<Student> studentList = new ArrayList<Student>();

			while (rs.next()) {

				studentList.add(new Student(rs.getString("name"), rs.getString("surname"), rs.getString("am")));

			}

			rs.close();
			stmt.close();

			return studentList;

		} catch (Exception e) {

			throw new Exception("An error occured while getting students from database: " + e.getMessage());
			
		} finally {
			
			try {
				db.close();
			} catch (Exception e) {
				
			}
			
		}

	}// End of getStudents

	public void saveStudent(Student student) throws Exception {

		Connection con = null;
		String sql = "INSERT INTO  student_table (am, name, surname) VALUES (?, ?, ?);";
		DB db = new DB();
		
		try {

			db.open();
			con = db.getConnection();

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, student.getAm());
			stmt.setString(2, student.getName());
			stmt.setString(3, student.getSurname());

			stmt.executeUpdate();

			stmt.close();

		} catch (SQLException e) {

			throw new Exception("Student with AM: " + student.getAm() + " already exists");

		} catch (Exception e) {

			throw new Exception("An error occured while inserting student to database: " + e.getMessage());
			
		} finally {
			
			try {				
				db.close();				
			} catch (Exception e) {
											
			}
			
		}

	}// End of getStudents

	public ArrayList<Student> findStudentByKeyword(String keyword) throws Exception {

		Connection con = null;
		ArrayList<Student> results = new ArrayList<Student>();		
		DB db = new DB();
		String sqlquery = "SELECT * FROM student_table WHERE surname LIKE ? OR name LIKE ? OR am LIKE ?;";
		
		
		try {
			
			db.open(); //open connection
			con = db.getConnection(); //get Connection Object
			PreparedStatement stmt1 = con.prepareStatement(sqlquery);
			stmt1.setString(1, "%"+keyword+"%");
			stmt1.setString(2, "%"+keyword+"%");
			stmt1.setString(3, "%"+keyword+"%");
			
			ResultSet rs =stmt1.executeQuery();
			
			while(rs.next()){
				results.add(new Student(rs.getString("name"),rs.getString("surname"),rs.getString("am")));
			}
			
			rs.close();
			stmt1.close();
			db.close();

			return results;

			

		} catch (Exception e) {

			throw new Exception("An error occured while searching for student in the database: " + e.getMessage());
			
		} finally {
			
			try {
				db.close();
			} catch (Exception e) {
				
			}
		}

	}// End of getStudents

}// End of class
