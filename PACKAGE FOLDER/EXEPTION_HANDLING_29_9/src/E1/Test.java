package E1;



public class Test {

	public static void main(String[] args) {
		  int a = 10;
		  int b = 0;
		  int c ;
		  try {
			  String fname = args[0];
			  String lname = args[0];
			  System.out.println(" Name is"+fname+" "+lname);
			  
			  c = a / b;
			  System.out.println("Anser is "+c);
		  }
		  catch(ArithmeticException ae) {
			   System.out.println("please secoun value do not put 0 ");
		  }
		  catch(ArrayIndexOutOfBoundsException ar) {
			   System.out.println("please provide at least two argument console");
		  }
		  
		  catch(Exception e) {
			  System.out.println("please currect value put ");
		  }
			  

	}

}
