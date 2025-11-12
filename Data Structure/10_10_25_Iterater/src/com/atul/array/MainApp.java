package com.atul.array;

public class MainApp {
	static int[] sortZero(int[] arr) {
		int k=0,count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k++]=arr[i];
			}
			else {
				count++;
			}
		}
		
		for(int i = 0;i<count;i++) {
			arr[k++]=0;
		}
		
		return arr;
	}
	static int[]  sortArray(int[] arr) {
		int temp;
		  for (int i = 0; i < arr.length - 1; i++) {       
	            for (int j = 0; j < arr.length - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {10,0,18,00,42,55,0,15,0,5};
		

	}

}
