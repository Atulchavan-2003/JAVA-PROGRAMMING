package com.atul.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticateUser implements Connectivity {
	
	static Connection  getConnection1() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Atul@123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String   checkValidate(String pin) {
		
		String quary = "select balance from card where pin_no =?";
		
		try {
			PreparedStatement pstmt = AuthenticateUser.getConnection1().prepareStatement(quary);
			pstmt.setString(1, pin);
			ResultSet rs = pstmt.executeQuery();
			
			if( rs.next()) {
				return rs.getString(1);
			}
			else{
				return "balance is not sufficient";
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "nothig here";
		
	}
	
	public boolean checkCard(String userName, String cardNo, String pin) {
	
			
			String query = "select * from card where user_name= ? and card_no =? and pin_no = ?";
			
			try {
				
				PreparedStatement pstmt = AuthenticateUser.getConnection1(). prepareStatement(query);
				
				pstmt.setString(1,userName);
				pstmt.setString(2,cardNo);
				pstmt.setString(3, pin);
				
				ResultSet rs = pstmt.executeQuery();
				
				return rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return false;
	}


	@Override
	public String checkBalance(String pin) {
		// TODO Auto-generated method stub
		return null;
	}


	



}
