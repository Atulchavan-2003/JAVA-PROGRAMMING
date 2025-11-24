package com.atul.graph;

public class MainApp {

	public static void main(String[] args) {
		Graph gr = new Graph ();
		
		Node n1 = new Node("atul");
		Node n2= new Node("sandeep");
		Node n3 = new Node("gopal");
		gr.insertNode(n1);
		gr.insertNode(n2);
		gr.insertNode(n3);
		gr.connectNode(n1, n2);
		gr.connectNode(n1, n3);
		gr.print(n1);

	}

}
