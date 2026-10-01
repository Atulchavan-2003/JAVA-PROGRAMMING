package com.bijamwar.hariom;

import java.util.ArrayList;

public class ProductTotalBusiness {
	public int totalCartVal(String[] products )
	{
		DatabaseConnectivity connectivity=new DatabaseConnectivity();
		
		return connectivity.getTotalAmount(products) ;
	}
//
//	public void ProductTotalBusiness(ArrayList<String> product) {
//		// TODO Auto-generated method stub
//		
//	}
}
