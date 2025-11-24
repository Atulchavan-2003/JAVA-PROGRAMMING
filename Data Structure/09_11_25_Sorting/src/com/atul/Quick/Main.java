package com.atul.Quick;

public class Main {
	public static void main(String[] args) {
		int[] arr = {23,6,25,3,99,10};
		
	
		
		sort(arr);
		
	}

	private static void sort(int[] arr) {
		int pivot = arr[arr.length-1];
		int count = 0;
		
//			  int key = arr[i];
			  
		     for(int j = 0;j <arr.length-1;j++) {
		    	 
		    	 if(arr[j]< pivot) {
		    		
		    		 int temp = arr[count];
		    		 arr[count++]=arr[j];
		    		 arr[j]=temp;
		    		 
		    	 }
		     }
	
				
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
