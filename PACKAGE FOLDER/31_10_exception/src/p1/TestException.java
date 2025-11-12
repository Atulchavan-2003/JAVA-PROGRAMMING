package p1;

public class TestException {
	static int devide(int i, int j) {
		try {
		  return i/j;
		}catch(ArithmeticException e) {
			System.out.print("can not devide by := ");
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,200,30,40};
		int[] arr2 = {2,3,0,40};
		for(int i=0;i<6;i++) {
			try {
			System.out.println(TestException.devide(arr1[i], arr2[i]));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("good job");
	}
}
