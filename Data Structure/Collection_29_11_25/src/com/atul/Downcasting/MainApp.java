package com.atul.Downcasting;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<String>();
		
		s1.add("atul");
		s1.add("rahul");
		s1.add("prashant");
		
		for (String str  : s1) {
		
			System.out.println(str.length());
		}
	}
	public static void main1(String[] args) {
		List<String> l1 = new ArrayList<String>(); 
		
		l1.add("atul");
		l1.add("rahul");
		l1.add("prashant");
		
//		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
		
			System.out.println(l1.get(i).length());
		}
	}

}
