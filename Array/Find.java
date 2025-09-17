import java.util.Scanner;
class Find{
      int[] arr;
        Find(int[] a){
	    this.arr = a;
	}
	
	void FindOddEven(){
	     for(int i= 0 ;i<arr.length;i++){
                 if(arr[i] % 2 == 0){
		    System.out.println("even no : "+arr[i]);
 		 }
		 else {
		    System.out.println("odd no : "+arr[i]);

		 }
             }
	}

}
class Testfind{
 	public static void main (String args[]){
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {1,2,3,4,5};
		
	    Find f1 = new Find(arr); 
	    f1.FindOddEven();
	} 
}