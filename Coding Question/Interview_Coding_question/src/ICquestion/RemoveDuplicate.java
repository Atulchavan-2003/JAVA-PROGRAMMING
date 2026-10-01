package ICquestion;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {10,20,30,5,30,20,40,40};
		int n = arr.length;
		
		System.out.println("hello");
		for (int i = 0; i < n; i++) {
			
			 for(int j = i+1;j<n;j++) {
				 
				 if(arr[i]==arr[j]) {
					 
					 for(int k = j;k<n-1;k++) {
						 
						 arr[k]=arr[k+1];
						 
					 }
					 
					 j--;
					 n--; 
				 }
			 }
		}
		
		for(int i = 0;i < n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
