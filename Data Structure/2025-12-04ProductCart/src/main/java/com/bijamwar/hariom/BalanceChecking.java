package com.bijamwar.hariom;

public class BalanceChecking {

	public boolean checkBalance(int ccno,int rqstAmt)
	{
		
		BalanceExist connectivity=new CardDatabaseConnectivity();
		  
		 if(rqstAmt<=connectivity.provideAvailableAmt(ccno))
		 {
			 return true;
		 }
		 return false;
	}
}
