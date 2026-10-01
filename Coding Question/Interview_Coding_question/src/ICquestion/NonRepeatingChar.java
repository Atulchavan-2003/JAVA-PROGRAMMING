package ICquestion;

public class NonRepeatingChar {

	public static void main(String[] args) {
		String str = "PrPogramming";
		
		for(int i = 0; i< str.length();i++) {
			int count = 0;
			for(int j = 0;j< str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println("in side inner loop");
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println("First non repeting Character : "+str.charAt(i));
				break;
			}
		}

	}

}
