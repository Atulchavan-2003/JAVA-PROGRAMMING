package com.bijamwar.hariom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class CardDatabaseConnectivity implements CardValidationConnectivity,BalanceExist{
	public boolean isCardValid(int ccno, String cHolderName, int cvv, LocalDate expDate) {
		java.sql.Date sqlDate = java.sql.Date.valueOf(expDate);
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carddetails","root","777666@Pb");
			String query="select * from cards where credit_card_num =? and name =? and cvv=? and  expiry_date=?  ";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, ccno);
			pstmt.setString(2, cHolderName);
			pstmt.setInt(3, cvv);
			pstmt.setDate(4, sqlDate);
			rs=pstmt.executeQuery();
			
			
			return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    if(rs != null)	    	
		    	{
		    	try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		    	
		    	}
		    			    	
		    if(pstmt != null) 
		    {
		    	try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    	
		    	
		    if(con != null)
		    	{
		    	try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		    	
		    	}
		}
	
		return false;
	}
	
	public int provideAvailableAmt(int cardNum)
	{
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carddetails","root","777666@Pb");
			String query="select balance from cards where credit_card_num=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, cardNum);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int avlblAmt=rs.getInt(1);
				return avlblAmt;
			}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		    if(rs != null)	    	
		    	{
		    	try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		    	
		    	}
		    			    	
		    if(pstmt != null) 
		    {
		    	try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		    	
		    	
		    if(con != null)
		    	{
		    	try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		    	
		    	}
		}
		
		return -1;
	}
}
