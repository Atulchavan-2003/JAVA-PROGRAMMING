class java05{
	public static void main(String args[]){
		int no = 123;
		int rem,rev=0; 
               	while(no>0){
		   rem = no%10;
                   rev = rev*10+rem;
                   no = no/10;   
		}// loop end here 
		if(no==rev){
		   System.out.println("number is pallindrome");	
		}// if end here 
		else {
		   System.out.println("number is not pallindrome");
		}// else end here  
	}// main end here
}