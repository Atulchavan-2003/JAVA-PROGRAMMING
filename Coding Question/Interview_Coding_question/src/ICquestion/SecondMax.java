package ICquestion;

public class SecondMax {

	public static void main1(String[] args) {
		int[] arr = {6,2,3,7,4,5};
        int max = arr[0];
        
        for(int i = 1; i<arr.length;i++) {
        	
        	if(arr[i]>max) {
        		max = arr[i];
    
        	} 
        }
        System.out.println(max);
        for(int i = 0; i<arr.length;i++) {
        	
			/*
			 * if(arr[i]>max || arr[i]!=max ) { max = arr[i];
			 * 
			 * }
			 */
        
        }
        System.out.println(max);
        
	}
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,5,0,40,0};
		 int firstMax = Integer.MIN_VALUE;
		 int secondMax = Integer.MIN_VALUE;
		 for(int i = 0; i< arr.length; i++) {
			 if(arr[i] > firstMax) {
				 secondMax = firstMax;
				 firstMax = arr[i];
			 }else if(arr[i] < firstMax && arr[i] > secondMax) {
				 secondMax = arr[i];
			 }
		 }
		 System.out.println(secondMax);
	}

}
