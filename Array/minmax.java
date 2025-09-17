import java.util.Scanner;

class Minmax{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[5];
	    int c = 1;
           
            
	    for(int i = 0 ; i<arr.length;i++){
		 System.out.println("Enter the "+ c);

	        arr[i]=sc.nextInt();
		c++;
	    }
	    
	    for(int i = 0;i<arr.length;i++){
		System.out.println(arr[i]);
	    }

            int min = arr[0];
 	    int max = arr[0];
	    for(int i = 0;i<arr.length;i++){
		if(arr[i]>min){
		    max= arr[i];
		}
		if(arr[i]<max){
		    min = arr[i];
		}
	    }
	    System.out.println("min :"+min+" max :"+ max);
	}
}