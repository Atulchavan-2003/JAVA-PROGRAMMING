package com.atul.selectionSort;

public class MainApp {

	public static void main(String[] args) {
		
		int[] arr = {10,65,48,4,9};
		
		selectionSort(arr);

	}

	static void selectionSort(int[] arr) {
				
		for(int i = 0;i<arr.length;i++) {
			int min = arr[i];
			int index = i;

			for(int j = i+1 ; j<arr.length;j++) {
				
				if(min > arr[j]) {
				    min = arr[j];
				    index = j;
				}
			}
			arr[index]=arr[i];
			arr[i] = min;
			
		}
		
		for(int i= 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
