package com.atul.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
	HashMap<Node,ArrayList<Node>> adjacencyList;
	
	
	public Graph() {
		adjacencyList = new HashMap();
	}


	void insertNode(Node v) {
		adjacencyList.put(v, new ArrayList<Node>());
		
	}
	void connectNode(Node n1, Node n ) {
		ArrayList<Node> list =  adjacencyList.get(n1);
		list.add(n);
	}
	void print(Node n) {
		System.out.println(n.data);
		ArrayList<Node> list =  adjacencyList.get(n);
		
		for(Node l1 :list) {
			
			System.out.println(l1.data);
		}
	}
}
