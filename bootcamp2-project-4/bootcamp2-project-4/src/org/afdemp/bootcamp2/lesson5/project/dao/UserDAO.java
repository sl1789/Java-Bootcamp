package org.afdemp.bootcamp2.lesson5.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.afdemp.bootcamp2.lesson5.project.connection.DB;
import org.afdemp.bootcamp2.lesson5.project.domain.User;

public class UserDAO {

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public User authenticateUser (String username, String password) throws Exception {

		Connection con = null;
		DB db = new DB();
		
		ResultSet rs = null;
		PreparedStatement st = null;
		String sqlq= "SELECT * FROM user_table WHERE username = ? AND password = ?;";
		User user = null;
		
		try{
			db.open();
			con = db.getConnection();
			st = con.prepareStatement(sqlq);
			st.setString(1, username);
			st.setString(2, password);
			rs =st.executeQuery();
			try{if (rs.next()){
				user= new User(rs.getString("username"),rs.getString("password"),rs.getString("email"));
				//return user;
			}}catch(Exception e){
				throw new Exception("No users of this name were found"+e.getMessage());
			}
			rs.close();
			st.close();
			db.close();
			return user;
		}catch(Exception e){
			throw new Exception("Could not connect to database "+e.getMessage());
		}
		
	} //End of authenticateUser
	/*public static void main(String [] args) throws Exception{
		UserDAO x = new UserDAO();
		User xx= x.authenticateUser("as", "123");
		System.out.println(xx.getEmail());
		
	}*/
	
} //End of class
