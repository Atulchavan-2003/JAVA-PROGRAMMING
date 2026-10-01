package com.atul.coinCollection;

public class MainApp {
	public static void main(String[] args) {
		coinManagement ref = coinManagement.getObject();
		ref.addReadFile();
		ref.addDatabase();
//		ref.SearchData( "uk" );
		
//		ref.update(101);
		ref.display();
		ref.addDataIntoDatabase();
				
	}
}
