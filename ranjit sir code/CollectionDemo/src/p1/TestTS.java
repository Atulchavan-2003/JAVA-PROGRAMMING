package p1;

import java.util.*;

public class TestTS {

	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(5);
		t1.add(7);
		t1.add(30);
		System.out.println(t1);
		
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1=new TreeSet();
		t1.add(new Employee(10,"Sachin",20000));
		t1.add(new Employee(18,"Virat",25000));
		System.out.println(t1);
		

	}

}
