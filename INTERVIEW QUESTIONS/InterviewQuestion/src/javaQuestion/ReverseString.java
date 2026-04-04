package javaQuestion;

public class ReverseString {
	 public static void main(String[] args) {
		String str = "atul";
		String str2 = "";
		for (int i = str.length()-1; i >= 0; i--) {
			     str2 += str.charAt(i);
		}
		System.out.println("reverse String "+str2);
	}
	 
	 public static void main1(String[] args) {
	        String str = "atul";
	        StringBuilder sb = new StringBuilder();

	        for (int i = str.length() - 1; i >= 0; i--) {
	            sb.append(str.charAt(i));
	        }

	        System.out.println("Reverse String: " + sb.toString());
	    }
}
