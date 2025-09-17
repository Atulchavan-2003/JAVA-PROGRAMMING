class Short{
	public static void main(String[] args){
	    int[] arr = {5,6,1,3,2};
	    int temp;
	    for(int i = 0; i<arr.length-1;i++){
		for(int j = 0;j < arr.length-1;j++){
		     if(arr[j]>arr[j+1] ){
		         temp=arr[j];
		         arr[j]=arr[j+1];
		         arr[j+1] = temp;
		      }	
		}

	    }


        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("}");		
		
	}	
}