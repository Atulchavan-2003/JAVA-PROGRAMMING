package com.atul.coinCollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateClass {

	
	public static int executeUpdatequery(String query, String newCountry, int id) {
		  Connection con = Connectivity.getObject().getConnecton();
		  
			try {
				PreparedStatement pstmt = con.prepareStatement(query);
				
				pstmt.setString(1, newCountry);
				pstmt.setInt(2,id);
				return pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return 0;
	}

}
