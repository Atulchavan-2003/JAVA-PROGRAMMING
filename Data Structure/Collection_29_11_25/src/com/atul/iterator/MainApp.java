package com.atul.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();
		
		a1.add("atul");
		a1.add("arvind");
		a1.add("rahul");
		a1.add("prashant");
//	
//		for (String str : a1) {
//		
//			if(str.equals("arvind")) {
//				a1.remove(str);
//			}	
//			
//		}
//		System.out.println(a1);
		
		Iterator<String> itr = a1.iterator();
		
		while(itr.hasNext()) {
			
			String str = itr.next();
			
			if(str.equals("arvind")) {
				itr.remove();
			}	
		}
		System.out.println(a1);

		

	}

}
