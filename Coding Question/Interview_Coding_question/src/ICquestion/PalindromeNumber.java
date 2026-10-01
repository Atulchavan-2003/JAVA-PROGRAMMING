package ICquestion;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 01;
		int rem = 0, revers = 0;
		int  original = number;
		while(number > 0) {
			rem = number % 10;
			revers = revers * 10 + rem;
			number = number/10;
		}
		
		 if(revers == original) {
			 System.out.println(revers+" number is palindrom");
		 }else {
			 System.out.println(revers+" number is not palindrom");
		 }
	}
}
