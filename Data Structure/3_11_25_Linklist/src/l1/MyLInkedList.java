package l1;

public class MyLInkedList {
	Node start;
	
	public void addLast(int data) {
		Node temp = new Node(data);
		if(start == null) {
			start = temp;
		}
		else {
			Node itr = start;
			
			while(itr.next != null) {
			   itr = itr.next;
			}
			
			itr.next = temp;
			
		}
		System.out.println("Data added!");
	}
	void addFirst(int data) {
		Node temp = new Node(data);
		
		if(start == null) {
			addLast(data);
		}
		else {
			 temp.next = start;
		        start = temp;
		}
	}
	void rivDisplay() {
		 
	}
	void display() {
		Node itr = start;
		
		while(itr.next != null) {
			
			System.out.println(itr.getData());
			itr = itr.next;
		}
		System.out.println(itr.getData());
	}
	
	public void position(int data, int posi) {
		Node temp = new Node(data);
		int count=1;
		if(start == null ||  posi <= 1) {
			start = temp;
		}
		
		Node itr = start;
		while(count< posi-1 && itr.next != null ) {
			itr = itr.next;
			count++; 
		}
//		 if (itr == null) {
//		        System.out.println("Invalid position: " + posi);
//		        return;
//		 }
		temp.next = itr.next;
		itr.next = temp;	
	}
	void deleteFirst() {
	    if (start == null) {
	        System.out.println("List is empty! Nothing to delete.");
	        return;
	    }

	    System.out.println("Deleted: " + start.getData());
	    start = start.next;
	}
	void deleteLast() {
	  Node itr = start;
	    while (itr.next.next != null) {
	        itr = itr.next;
	    }

	    System.out.println("Deleted: " + itr.next.getData());
	    itr.next = null;
	}
	
	
	
}
