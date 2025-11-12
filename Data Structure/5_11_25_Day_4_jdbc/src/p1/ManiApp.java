package p1;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManiApp {
	public static void main(String[] args) {
		// step1 : load the driver
		Scanner sc = new Scanner(System.in);
		String user = sc.next();
		String pwd = sc.next();
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Atul@123");

		    String query = "insert into employee(userid,password) value(?,?)";
		    PreparedStatement pstmt = con.prepareStatement(query);
		    pstmt.setString(1, user);
		    pstmt.setString(2, pwd);

		    int updateRowCount = pstmt.executeUpdate();
		    System.out.println(updateRowCount + " row inserted.");

		    con.close();
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (SQLException e) {
		    e.printStackTrace();
		}

	}
}
