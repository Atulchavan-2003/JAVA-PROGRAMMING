import java.util.Scanner;
class SumArray{
      int[] arr;
      SumArray(int[] arr){
	  this.arr= arr;
      }
	
        int sumOfArray(){
         int sum = 0;  
	    for(int i = 0;i<arr.length;i++){
	         sum += arr[i];  
	    } 
	    return sum;   		
	}

}
class Testsum{
   	public static void main(String[] args) {
    	    Scanner sc = new Scanner(System.in);
	      int[] arr ={1,2,3}; 
	      
		
	       SumArray s1 = new SumArray(arr);
	       System.out.println("sum is :"+s1.sumOfArray());
   	}
}