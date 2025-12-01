package com.atul.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainApp {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		list.add(13);
		list.add(5);
		list.add(17);
		
		list.remove(Integer.valueOf(5));
		
		Collections.sort(list);
		System.out.println(list);
		
		
		List<String> list1 =Arrays.asList("monday","tuesday");
		//list2.add("atul"); // you can not change it value because asList fix array.
		list1.set(0,"wednesday" );
	 	
		System.out.println(list1);
		
		String[] array = {"apple","banana","Cherry"};
		List<String> list2 = Arrays.asList(array);
//		list.set(0, "atul"); 
		System.out.println(list2);
		
		List<Integer> list3=List.of(1,2,3,4);
		list.addAll( list3);
//		list3.set(0, 8); here also not set and add
		System.out.println(list);
		
		
		
	}

	private static Object valueOf(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
