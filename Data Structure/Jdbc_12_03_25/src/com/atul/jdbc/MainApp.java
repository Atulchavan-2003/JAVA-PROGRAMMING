package com.atul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Atul@123");
		 String query = "select * from user ";
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
			
		while (rs.next()) {
			System.out.print(rs.getString(1)+" ");
			System.out.println(rs.getString(2));
			
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
