package com.atul.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		
		int mark = 70;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hibernateDb",
					"root",
					"Atul@123"
					);
			String query = "delete from student where mark=?";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, mark);
			
			int i = ps.executeUpdate();
			
			if(i> 0) {
				System.out.println("delete done");
			}else {
				System.out.println("error");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
