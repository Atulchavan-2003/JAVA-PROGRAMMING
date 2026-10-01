package ICquestion;

public class ZeroToEnd {

	public static void main(String[] args) {
	    int[] arr={1,0,2,0,4,0,5};
	    int k = 0,count = 0;
	    for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[k++]=arr[i];
			}
		}
		
	    for (int i = k; i < arr.length; i++) {
			arr[i]=0;
		}
	    for (int j = 0; j < arr.length; j++) {
	    	System.out.println(arr[j]+" ");
		}
	    	

	}

}
