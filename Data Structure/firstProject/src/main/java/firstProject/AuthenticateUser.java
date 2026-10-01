package firstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticateUser implements Connectivity {

	@Override
	public boolean checkUser(String user, String pwd) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Atul@123");
			
			String query = "select * from user where username=? and password = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,user);
			pstmt.setString(2,pwd);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
