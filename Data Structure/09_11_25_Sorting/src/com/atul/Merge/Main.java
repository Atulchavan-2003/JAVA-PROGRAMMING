package com.atul.Merge;

public class Main {
    public static void main(String[] args) {
        int[] arr = {72,1,47,6};

        sort(arr, 0, arr.length - 1);

     // Print
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
           
            sort(arr, left, mid);
      
            sort(arr, mid + 1, right);
           
          merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int LeftSize = mid - left + 1;
        int RightSize = right - mid;

        int[] Leftarr = new int[LeftSize];
        int[] Rightarr = new int[RightSize];

        //copy data
        //i=leftctr
        //j=rightctr
        //k=mergectr
        for (int i = 0; i < LeftSize; i++) {
            Leftarr[i] = arr[left + i];
        }

        for (int j = 0; j < RightSize; j++) {
            Rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < LeftSize && j < RightSize) {
            if (Leftarr[i] <= Rightarr[j]) {
                arr[k] = Leftarr[i];
                i++;
            } else {
                arr[k] = Rightarr[j];
                j++;
            }
            k++;
        }

        while (i <LeftSize) {
            arr[k] = Leftarr[i];
            i++;
            k++;
        }

        while (j <RightSize) {
            arr[k] = Rightarr[j];
            j++;
            k++;
        }
    }

	
}
