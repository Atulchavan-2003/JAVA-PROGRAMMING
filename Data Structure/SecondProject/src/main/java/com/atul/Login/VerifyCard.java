package com.atul.Login;

public class VerifyCard {


	public boolean isValidCard(String userName, String cardNo, String pin) {
		
		Connectivity ref = new AuthenticateUser();
		
		return ref.checkCard(userName,cardNo,pin);
	}

}
