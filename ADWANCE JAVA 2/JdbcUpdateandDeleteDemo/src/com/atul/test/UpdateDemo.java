package com.atul.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		int id = 3 ;
		int mark = 70;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=  DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/hibernateDB",
				"root",
				"Atul@123"
				);
		
		String query = "update student set id = ? where mark = ?;";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setInt(2, mark);
		
	 int result = 	ps.executeUpdate();
		
	 if (result >0 ) {
		 System.out.println("Updated successfully");
	 }else {
		 System.out.println("error");
	 }
	 
	}
}
