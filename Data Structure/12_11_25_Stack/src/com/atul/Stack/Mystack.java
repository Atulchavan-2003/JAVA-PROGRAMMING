package com.atul.Stack;

public class Mystack {
	 private int top = 0;
	 private Node[] stack = new Node[10];
	 private static Mystack ref = new Mystack();
	 

	private Mystack() {
		// TODO Auto-generated constructor stub
		
	
	}
	
	public static Mystack getObject() {
		return ref;
	}

	public void push(int data) {
		Node temp  = new Node(data);
		  stack[top++]=temp;  
		
	}
	void pop() {
		if(top == 0) {
			System.out.println("stack is mty");
		}
		Node  temp = stack[top-1];
		stack[top]=null;
		top--;
		System.out.println("sucsesfully pop!"+temp.data);
		
	}
	
	void peek() {
		if(top == 0) {
			System.out.println("stack is mty");
		}else {
            System.out.println("Top element: " + stack[top - 1].data);
        }
		
	}
	void pushBottum(int data) {
		
		if(top == stack.length) {
			System.out.println("stack is overflow!");
			return;
		}
		if(top == 0) {
			
			stack[top++]= new Node(data);
			return;
		}
		
		Node temp = 
		
		pushBottum(stack[--top].data);
		
		
		
	}

	void display() {
		if(top == 0) {
			System.out.println("stack is mty");
		}
	  for(int i = top-1;i>=0;i--)
		System.out.println(stack[i].data);
		 
	}


	 
}
