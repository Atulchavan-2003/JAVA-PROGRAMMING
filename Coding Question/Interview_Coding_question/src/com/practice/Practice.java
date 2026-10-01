package com.practice;

public class Practice {
	
     void reverseS(String str) {
    	      System.out.println("Original : "+str);
    	      
    	      String rev = "";
    	      
    	      for(int i = str.length()-1; i >= 0;i--) {
    	    	  		rev = rev + str.charAt(i); 
    	      }
    	      System.out.println(rev);
    	      
     }
     
     void PalindromeS(String str) {
    	        
    	 		String rev = "";
    	        
    	       for(int i = str.length()-1;i >= 0; i--) {
    	    	   		rev = rev + str.charAt(i);
    	       }
    	       
    	       if(rev.equals(str)) 
    	    	   		System.out.println("String is pallindrome");
    	       else 
    	    	   		System.out.println("String is not palindrome");
     }
     
     void reverseNo(int num) {
    	    System.out.println("original number :"+num);
    	 	 int rem,rev= 0;
    	      while (num > 0) {
    	    	  	 rem = num % 10;
    	    	  	 rev = rev *10 + rem;     
    	    	  	 num = num/10;
    	      }
    	      
    	      System.out.println("reverse number "+rev);
    	 
     }
     
     void primeNo(int num) {
    	     int count = 0;
    	 	for(int i = 1;i<= num; i++) {
    	 		if(num%i == 0)
    	 			count++;
    	 		
    	 	}
    	 	
    	 	if(count == 2)
    	 		System.out.println("prime number");
    	 	else 
    	 		System.out.println("not prime number");
    	 
     }
     
     void fibonacciS(int num) {
    	    int a = 0, b=1,c;
    	    
    	    for(int i = 1; i<= num;i++) {
    	    		System.out.println(a);
    	    		
    	    		c = a+b;
    	    		a = b;
    	    		b = c;
    	    		
    	    }
     }
     
     void armStrongNo(int num) {
    	      int original = num, sum1=0;
    	      
    	      while(num > 0) {
    	    	  int sum = 1;
    	    	  
    	    	  int rem= num % 10;
    	    	  	 for(int i = 1;i<=3;i++) {
    	    	  		  sum *=rem;
    	    	  	 }
    	    	  	 num=num /10;
    	    	  	 sum1 += sum;
    	      }
    	      
    	      
    	      if(original == sum1) {
    	    	   	   System.out.println(" Number is Armstrong " + sum1);
    	      }
    	      else {
    	    	  	   System.out.println("Number is not ArmStrong"+sum1);
    	      }	   
     }
     
    void factorial(int n) {
        int fact = 1;
    	    for(int i = n ; i > 0 ;i-- ) {
    	    	     fact = fact * i;
    	    }
    	    System.out.println(fact);
 		
 	}
    
    void findDuplicate(int[] arr) {
    		for(int i = 0 ;i< arr.length;i++) {
    			for(int j = i ; j< arr.length-1;j++) {
    				if(arr[i] == arr[j+1]) {
    					System.out.println(arr[i]);
    				}
    			}
    		}
    }
    
    void findSecondMax(int[] arr) {
    	    int max = Integer.MIN_VALUE;
    	    int secondMax = Integer.MIN_VALUE;
    	    
    		for(int i = 0; i < arr.length;i++) {
    			if(arr[i] > max ) {
    				secondMax = max;
    				max = arr[i];
    				
    			}else if(arr[i]> secondMax) {
    				secondMax = arr[i];
    			}
    		}
    		System.out.println(secondMax);
    }
    
    void arithmatic(int a , int b) {
    	
    	
    	System.out.println("these are the arithmatic operator ");
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    	System.out.println(a-b);
    	
    	
    }
     
	public static void main(String[] args) {
	    
		System.out.println("hello world");
		
		Practice p = new Practice();
		
		int[] arr = {5,4,9,10,2,4,3};
		
		p.arithmatic(15, 2556);
		
//		p.findSecondMax(arr);
//		p.findDuplicate(arr);	
		
//		p.reverseS("atul");
//		p.PalindromeS("akkad");
//		p.reverseNo(1233);
//		p.primeNo(6);
//		p.fibonacciS(5);
		
//		p.armStrongNo(153);
		
//		p.factorial(5);
		
		
		

	}

	

}
