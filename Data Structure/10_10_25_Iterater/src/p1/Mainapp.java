package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class Mainapp {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("pune");
		cities.add("Mumbai");
		cities.add("mum");
		cities.add("Solapur");
		
//		for (String city : cities) {
//			if(city.equals("Mumbai")) {
//				cities.remove("Mumbai");
//			}
//		}
//		System.out.println(cities);
//		
		Iterator<String> myit = cities.iterator();
		while(myit.hasNext()) {
			String city = myit.next();
			if(city.equals("Mumbai"));
			 myit.remove();
		} 
		System.out.println(cities);
	}

}
