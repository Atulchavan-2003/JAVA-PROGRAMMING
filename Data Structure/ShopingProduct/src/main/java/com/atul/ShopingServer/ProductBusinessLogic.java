package com.atul.ShopingServer;

public class ProductBusinessLogic {	

	public int getTotalProduct(String[] productId) {
		
		Connectivity con = new DatabaseConnectivity();
		
		return con.getTotalAmt(productId);
	}

}
