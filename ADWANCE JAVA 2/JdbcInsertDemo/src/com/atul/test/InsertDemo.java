package com.atul.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/hibernateDb",
				"root",
				"Atul@123"
				);
		PreparedStatement ps =con.prepareStatement("insert into student values(?,?,?,?)");
		 
		
		ps.setInt(1,5);
		ps.setString(2,"met"); 
		ps.setInt(3, 56);
		ps.setString(4,"mayur");
		
		
		
		 int i = ps.executeUpdate();
		 
		 if(i>0) {
			 System.out.println("insert done");
		 }else {
			 System.out.println("error");
		 }
		 
		 
		  con.close();
		  
		  
		  
		  
	}
}
