package ICquestion;

public class FindDuplicate {

	public static void main(String[] args) {
		 int[] arr = {1,2,2,3,4,4,5};
		 int count=0;
		 for(int i = 0; i<arr.length;i++) {
			 
			 for(int j = i+1;j<arr.length;j++) {
				 if(arr[i] == arr[j] ) { 
					 int temp = 0;
					 for(int k= j;k< arr.length-1;k++) {
						  temp = arr[k];
						  arr[k]=arr[k+1];
						  arr[k+1]= temp;
						  
					 }
					 count++;
					 j--;
				 }
			 }
		 }
		 
		 for(int i = 0 ;i< arr.length-count;i++) {
			 System.out.println(arr[i]);
		 }

	}

}
