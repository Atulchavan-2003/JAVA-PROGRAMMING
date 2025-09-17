class Merge{
	public static void main(String[] args){
	     int[] arr = {1,2,3,4,5};
	     int[] brr = {10,20,30,40,50};
             int[] merge = new int[arr.length+ brr.length];
              
	     for(int i = 0;i<arr.length;i++){
		 merge[i]=arr[i];
	     }
		int n = 0;
	     for(int i = arr.length;i<merge.length;i++){
		
		 merge[i]=brr[n];
		 n++;
		 
	     }
		System.out.println("merge : ");
	     for(int i= 0;i<merge.length;i++){
                 System.out.print(merge[i]+" ");
	     }
	}
}