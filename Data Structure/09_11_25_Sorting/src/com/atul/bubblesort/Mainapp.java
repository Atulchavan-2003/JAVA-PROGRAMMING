package com.atul.bubblesort;

public class Mainapp {
	 void  sortZero(int[] arr) {
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
		
		for(int i = 0;i<arr.length;i++)
			System.out.print("["+arr[i]+"]");
		
	}
	 
	void  sortArray(int[] arr) {
		int temp;
		  for (int i = 0; i < arr.length - 1; i++) {       
	            for (int j = 0; j < arr.length - 1-i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
		System.out.println("After :");
		for(int i = 0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Mainapp app = new Mainapp();
		
		int[] arr = {5,4,3,2,1};
		System.out.println("Before :");
		for(int i = 0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		app.sortArray(arr);
//		app.sortZero(arr);
		
		
	}
}
