package com.atul.ShopingServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseConnectivity implements Connectivity {
	
	@Override
	public int  getTotalAmt(String[] productId) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Atul@123");
		
			
			String query = "select price from product where productId =?";
			
			int  total = 0;
			
			for(int i = 0;i<productId.length;i++) {
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, productId[i]);
				rs = pstmt.executeQuery();
				 
				if(rs.next()) {
					
					total += rs.getInt(1);
				}
				
			}
			
			return total;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return 0;
	}

}
