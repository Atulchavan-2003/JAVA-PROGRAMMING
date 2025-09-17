import java.util.Scanner;
class Search{
	int[] arr;
	
	Search(int[] arr){
	    this.arr = arr;
	}

        void searchNo(int n){
	      boolean found = false;
	      for(int i = 0;i<arr.length;i++){
		  if(arr[i] == n){
		      System.out.println("found at "+i+" index ");
		      found = true;
		      break;
		  }
               } 

	       if(found == false){
	            System.out.println("not found");
	       }

	}
	void display(){
	    for(int i = 0;i<arr.length;i++){
		System.out.println(arr[i]);
	    }
	}
	
}
class Testsearch{
 	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
            
	    int[] arr = new int[5];
	    int c = 1;

	    Search s1 = new Search(arr);

            System.out.println("Enter the number do you want to search");
            int n = sc.nextInt();
	    
	    for(int i = 0 ; i<arr.length;i++){
		System.out.println("Enter the "+ c);
	        arr[i]=sc.nextInt();
		c++;
	    }
	 
	    s1.display();
            s1.searchNo(n);
	}
}