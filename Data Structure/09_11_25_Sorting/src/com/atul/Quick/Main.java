package com.atul.Quick;

public class Main {
	public static void main(String[] args) {
		int[] arr = {23,6,25,3,99,10};
		
		quickSort(arr,0,arr.length-1);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	private static void quickSort(int[] arr,int start,int end) {
		if(start>=end) 
			return;
		
		 int p = partision(arr,start,end);
		 quickSort(arr,start,p-1);
		 quickSort(arr,p+1,end);
		
	}
	private static int partision(int[] arr, int start, int end) {
		
		int pivote = arr[end] ;
		int index = start-1;
		
		for(int i = start;i<end;i++) {
			if(arr[i]<pivote) {
				index++;
				swap(arr,index,i);
			}
		}
		index++;
		
		swap(arr,index,end);

		return index;
		
		
	}
	private static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

}
