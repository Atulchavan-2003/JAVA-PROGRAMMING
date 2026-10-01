package firstProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// this is service leyer component
@WebServlet("/authenticate")

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("inside the server");
		String user = req.getParameter("userName");
		String pwd = req.getParameter("password");
		
		VerifyUser ref = new VerifyUser();
		boolean result = ref.isValid(user, pwd);
		
		PrintWriter out = res.getWriter() ;
		
		if(result == true) {
			out.print("valide");
		}
		else {
			out.print("invalide");
		}
		
	}
	
	
}
