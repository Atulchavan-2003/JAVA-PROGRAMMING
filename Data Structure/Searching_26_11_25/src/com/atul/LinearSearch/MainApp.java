package com.atul.LinearSearch;

public class MainApp {
	public static void main(String[] args) {
		String[] arr = {"white","red","orange","blue","yello"};
		
		int index=Lsearch(arr,"yello");
		if(index !=0)
			System.out.println("found :"+arr[index]);
		else
			System.out.println("not found");
	}

	private static int  Lsearch(String[] arr,String str) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
}
