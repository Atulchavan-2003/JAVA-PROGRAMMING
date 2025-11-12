package t1;


import java.util.LinkedList;

import e1.Employee;

public class TestLL {


	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		
		l1.add(new Employee(10,"Sachin",20000));
		
		l1.add(new Employee(18,"Virat",25000));
		
		System.out.println(l1);
		

	}

}
