package com.atul.BinarySearch;

public class MainApp {

	public static void main(String[] args) {
		 int[] arr = {1,5,6,7,9,11,45,47,77};
		 
		 int index =binarySearch(arr, 3);
		 if(index !=-1) {
			 System.out.println("found at "+index);
		 }
		 else {
			 System.out.println("Element not found");
		 }

	}

	private static int binarySearch(int[] arr , int target) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target<arr[mid]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
			
		}
		return -1;
		
	}

}
