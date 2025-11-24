package com.atul.insertionSort;

import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
	     int[] arr = {40,20,60,1,50};
	     
	     insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {
	
		for(int i = 1;i<arr.length;i++) {
		     int key = arr[i];
		     int j;
		     for (j = i-1; j>=0; j--) {
				if(arr[j]>key) {
					arr[j+1]=arr[j];
				}
				else {
					break;
				}
			 }
		    
		    	arr[j+1]=key; 
		     
		}	
		for (int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}                                                                                                                                