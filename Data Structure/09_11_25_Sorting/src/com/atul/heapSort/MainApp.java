package com.atul.heapSort;

public class MainApp {

	public static void main(String[] args) {
		int[] arr = {10,25,3,14,1,9,18};
		
		buildMaxHeap(arr,arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void buildMaxHeap(int[] arr, int n) {
	    	
	    	for(int i = n/2-1;i>=0;i--) {
	    		heapify(arr,i,n);
	    	}
	    	
	   for(int i = n-1;i>0;i--)
	   {	
	    	swap(arr,0,i);
	    	heapify(arr,0,i);
	    	
	    }
	}

	private static void heapify(int[] arr, int index, int n) {
		int largest = index ;
		int left = 2*index+1;
		int right = 2*index+2;
		
		
		if(left<n && arr[left]>arr[largest]) {
			largest = left;
		}
		if(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if(largest != index) {
			swap(arr,largest,index);
			heapify(arr,largest,n);
		}
		
			
			
	
	}

	private static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}


}
