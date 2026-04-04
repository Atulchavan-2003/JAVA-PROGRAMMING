package javaQuestion;

public class Factorial {
		static int fact(int n) {
			if(n==0||n==1) {
				System.out.println("inside n1");
				return 1;
			}
			return  n * fact(n-1);
		}
		
		public static void main1(String[] args) {
			int n = 5 ;
			
			System.out.println(fact(n));
		}
		
		public static void main(String[] args) {
			int n = 10 ;
			int fact = 1;
			for(int i = 1 ;i<=n;i++) {
				fact *= i;
			}
			System.out.println(fact);
		}
		
		
}
