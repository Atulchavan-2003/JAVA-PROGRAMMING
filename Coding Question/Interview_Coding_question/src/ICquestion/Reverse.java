package ICquestion;

import java.util.Iterator;

public class Reverse {
	public static void main(String[] args) {
		String str = "atul";
		String revers ="";
		for(int i = str.length()-1; i >=0;i--) {
			revers = revers + str.charAt(i);
		}
		
		System.out.println("revers String :"+ revers);
	}
}
