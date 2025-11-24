package com.atul.Stack;

public class StackTest {
	

	public static void main(String[] args) {

		Mystack s1 = Mystack.getObject();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		s1.peek();
		s1.pop();
		s1.display();
	
		
		
		} 
}
