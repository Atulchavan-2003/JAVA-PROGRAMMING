package com.bijamwar.hariom;

import java.time.LocalDate;

public interface CardValidationConnectivity {
	public boolean isCardValid(int ccno,String cHolderName,int cvv,LocalDate expDate);
}
