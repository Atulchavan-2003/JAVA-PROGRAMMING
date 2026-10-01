package com.atul.Login;

public class ValideUser {

	public boolean isValide(String userName, String password) {
		
		Connectivity con = new AuthenticateUser();
		return con.checkValidate(userName, password);
		
		
		
	}

}
