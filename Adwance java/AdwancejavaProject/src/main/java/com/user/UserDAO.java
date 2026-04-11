package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.util.Util;

import Utility.DataBaseConnectivity;

public class UserDAO {

	public static boolean registerUser(String userName, String password, String email, String mobileNo) {
		
		try {
			Connection con = DataBaseConnectivity.getConnection1();
			
			String query ="insert into user (userName,password,email,mobileNo) values (?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setString(4, mobileNo);

			
			int row = pstmt.executeUpdate();
			
			if(row>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static List<User> getAllUsers() {

	    List<User> list = new ArrayList<>();

	    try {
	    		
	    		Connection con = DataBaseConnectivity.getConnection1();
	    		String query ="select id ,userName,email,mobileNO from user";
	         PreparedStatement pstmt = con.prepareStatement(query);

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            User u = new User();
	            
	            u.setId(rs.getInt("id"));
	            u.setUserName(rs.getString("userName"));
	            u.setEmail(rs.getString("email"));
	            u.setMobileNO(rs.getString("mobileNO"));

	            list.add(u);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}
		
	public static User getUserByUsername(String username) {

	    User user = null;

	    try {
	    	     System.out.println("inside getuserId()");
	        Connection con = DataBaseConnectivity.getConnection1();
	        String sql = "select * from user where username=?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, username);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            user = new User();
	            user.setId(rs.getInt("id"));
	            user.setUserName(rs.getString("userName"));
	            user.setEmail(rs.getString("email"));
	            user.setMobileNO(rs.getString("mobileNO"));
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return user;
	}


}
