package javaQuestion;

public class Fibonacci {
    static int fibo(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }

    public static void main1(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++) {
        		System.out.println(fibo(i)); 
        }
    }
    
    public static void main(String[] args) {
		int n = 10,a = 0,b = 1;
		System.out.println(a);
		for( int i = 1 ;i< n ;i++) {
			System.out.println(b);
			int c = a + b;
			    a = b;
				b = c;
				
		}
		
	}
}