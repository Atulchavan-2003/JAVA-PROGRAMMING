package com.bijamwar.hariom;

import java.time.LocalDate;

public class Verify {
	public boolean verifyCardDetails(int ccno,String cHolderName,int cvv,LocalDate expDate)
	{
		CardValidationConnectivity cardValidationConnectivity=new CardDatabaseConnectivity();
		return cardValidationConnectivity.isCardValid(ccno, cHolderName, cvv, expDate);
	}

}
