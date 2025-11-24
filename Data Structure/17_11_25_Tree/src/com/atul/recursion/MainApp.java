package com.atul.recursion;

public class MainApp {
	  Node root;
		public static void main(String[] args) {
			MainApp app = new MainApp();
			app.insert(50);
			app.insert(30);
			app.insert(60);
			app.insert(95);
			app.insert(68);
			
			app.inOrder(app.root);
			System.out.println();
			
		}

		void insert(int value) {
			root = insertValue(root, value);
		}

		Node insertValue(Node root2, int value) {
			if(root2 == null) {
				return  new Node(value);
			}
			if(root2.data > value) {
				root2.left = insertValue(root2.left,value);
			}
			else {
				root2.right = insertValue(root2.right,value);
			}
			
			return root2;
			
		}
		 void preOrder(Node root) {
		        if (root == null)
		        	return;

		        System.out.print(root.data + " ");
		        preOrder(root.left);
		        preOrder(root.right);
		 }
		 void inOrder(Node root) {
		        if (root == null)
		        	return;

		        inOrder(root.left);
		        System.out.print(root.data + " ");
		        inOrder(root.right);
		 }
		 
		 void postOrder(Node root) {
		        if (root == null) 
		        	return;

		        postOrder(root.left);
		        postOrder(root.right);
		        System.out.print(root.data + " ");
		 }
	}
