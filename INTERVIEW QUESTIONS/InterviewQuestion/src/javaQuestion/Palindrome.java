package javaQuestion;

public class Palindrome {
	public static void main(String[] args) {
		 int n= 121488;
		 int old = n ;
		 int rev = 0;
		 
		  while (n>0) {
			  int last = n%10;
			  rev = rev * 10+last;
			  n = n /10;
		  }
		  
		  if(old == rev) {
		    System.out.println("this the palindrome number "+rev);
		  }else {
			  System.out.println("not palindrome "+ rev);
		  }
	}
}
