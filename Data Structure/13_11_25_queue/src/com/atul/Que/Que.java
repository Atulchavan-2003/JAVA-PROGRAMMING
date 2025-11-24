package com.atul.Que;


public class Que {
	 private int head = 0;
	 private int tail = 0;
	 private Node[] que = new Node[10];
	 
	 private static Que ref = new Que();
	 
	public Que() {
		
	}	
	
	void send(String data) {
		if(tail == head ) {
			tail = 0;
			head = 0;
		}
		if(head+tail == que.length) {
			System.out.println("que is full");
		}
		if(tail == que.length && tail !=0) {
			tail = 0;
		}
		
		Node temp = new Node(data);
		
		que[tail++]=temp;
		
	}
	void retriv() {
		if(head+tail == que.length) {
			System.out.println("            ");
		}
		if(head == tail) {
			head = 0;
			tail =0;
		}
		if(head == que.length && tail !=0) {
			head = 0;
		}
		System.out.println(que[head].data);
		head++;
		
	}
	public static Que getObject() {
		return ref;
	}
	
	
}
