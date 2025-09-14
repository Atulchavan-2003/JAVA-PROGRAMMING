class java02 {
     	public static void main (String args[]){
           	int n = 12345;
                int count = 0;
		int rem;   
		while (n>0){
                   rem = n % 10;
  		   count++;		
		   n = n/10;	
	   	} // while loop end here 

		System.out.println("count is "+ count );

	}// main end here 	
}