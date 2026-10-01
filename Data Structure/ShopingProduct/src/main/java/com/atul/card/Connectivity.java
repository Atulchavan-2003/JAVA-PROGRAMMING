package com.atul.card;

public interface Connectivity {
	boolean checkCard(String userName, String cardNo, String pin);

	String checkBalance(String pin);
}
