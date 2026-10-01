package com.atul.Login;

public interface Connectivity {
	boolean checkCard(String userName, String cardNo, String pin);

	String checkBalance(String pin);
}
