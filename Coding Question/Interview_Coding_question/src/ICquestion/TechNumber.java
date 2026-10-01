package ICquestion;

public class TechNumber {

	public static void main(String[] args) {
		int num = 1234;
		int first,last,sum,square,digit = 0;
		 int orignal = num;
		 while(num > 0) {
			 digit++;
			 num=num/10;
		 }
		 System.out.println(digit);
		 
		 num = orignal; 
		 
		 int divisor = 1;
		 for(int i = 1;i<=digit/2;i++) {
			 divisor = divisor * 10;
		 }
		 
		 
		
	     first = num/divisor;
		 last = num%divisor;
		
		 sum = first+last;
		 square = sum*sum;
		 
		 if(square == num) {
			 System.out.println("tech number");
		 }else {
			 System.out.println("non tech number");
		 }
	}

}
