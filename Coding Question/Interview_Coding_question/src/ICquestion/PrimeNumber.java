package ICquestion;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		 if (number <= 1) {
	            System.out.println("Not Prime");
	            return;
	        }
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				System.out.println("number is not prime ");
				return ;
			}
		}
		
		System.out.println("prime");
	}
}
