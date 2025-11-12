package p2;

public class TestStudent {

	public static void main(String[] args) {
		// Approach 1 : Impliment in a class
		 ArithmaticOps add = new Addition ();
		 System.out.println(add.calculate(10,10));
		// Approach 2 : Anonymous Inner class
		 ArithmaticOps add1 = new ArithmaticOps()
				 {
			 		public int calculate(int a,int b) {
			 			return a-b;
			 		}
			 		
				 };
		 System.out.println(add1.calculate(12, 12));
		 
		//Approach 3 : lambda Expression
		 // functinal interface
		 ArithmaticOps multi = (ops1,ops2) -> ops1/ops2;
		 System.out.println(multi.calculate(12, 12));
		 
		 
		 ArithmaticOps multi1 = (ops1,ops2) ->
		   {
			   System.out.println("inside lambda");
			   return ops1*ops2;
		   };
		 
		 
		 System.out.println(multi1.calculate(12, 12));
	}
	public static void main1(String[] args) {
		
		Payfees[] st = { new onlineStudent(),new DemoStudent(),new OfflineStudent()};
		
		for(Payfees ref: st ) {
			ref.payonline();
		}
	}

}
