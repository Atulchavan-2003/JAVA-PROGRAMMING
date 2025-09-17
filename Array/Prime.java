class Prime{
	int[] arr;
	Prime(int[] a){
	    this.arr=a;
	}
	void printPrime(){
              for(int i = 0;i<arr.length;i++){
		    int count = 0;
		   for(int j=1;j<=arr[i];j++){
		        if(arr[i]%j==0){
			     count++;
			}
		   }
		if(count==2){
		    System.out.println("prime number"+arr[i]);
		}
	      }		

	}
    	public static void main(String args[]){
	     int[] arr = {1,2,3,4,5,6,7,8};
	     Prime p1= new Prime(arr);
	     p1.printPrime();
	}  
}