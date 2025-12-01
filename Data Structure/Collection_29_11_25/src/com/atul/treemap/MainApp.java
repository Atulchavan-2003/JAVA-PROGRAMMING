package com.atul.treemap;

import java.util.Collections;
import java.util.TreeMap;

import com.atul.Student.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap();
		

		tm.put(new Key(57),new Student (57,450,"Sachin"));
		tm.put(new Key(34),new Student (34,590,"rahul"));
		tm.put(new Key(88),new Student (88,700,"Dhoni"));
		
		System.out.println(tm);
		
		
		
		
	}

}
