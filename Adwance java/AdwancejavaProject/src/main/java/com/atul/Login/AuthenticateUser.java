package com.atul.Login;
import Utility.DataBaseConnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utility.DataBaseConnectivity;

public class AuthenticateUser implements Connectivity {
	
	
	@Override
	public boolean checkValidate(String userName, String password) {
		
		String query = "select * from user where userName =? and password =?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		con=DataBaseConnectivity.getConnection1();
		
		try {
		    pstmt = con.prepareStatement(query);
		    
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			
		   rs = pstmt.executeQuery();
			 
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return false;
		
	}

}
