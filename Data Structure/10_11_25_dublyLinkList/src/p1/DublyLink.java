package p1;

public class DublyLink {
	 Node start = null;
	    Node end = null;

	    void addBeg(int data) {
	        Node temp = new Node(data);

	        if (start == null) {
	            start = end = temp;
	        } else {
	            temp.next = start;
	            start.prev = temp;
	            start = temp;
	        }
	    }
	    void deleteEnd() {
	    	if (start == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	     
	        if (start == end) {
	            start = end = null;
	            System.out.println("First node deleted, list is now empty.");
	            return;
	        }
	        
	        end=end.prev;
	        end.next = null;
	        System.out.println("last node deleted successfully.");
	    }
	    void deleteBeg() {
	        if (start == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	     
	        if (start == end) {
	            start = end = null;
	            System.out.println("First node deleted, list is now empty.");
	            return;
	        }

	      
	        start = start.next;  
	        start.prev = null;   
	        System.out.println("First node deleted successfully.");
	    }

	    void addEnd(int data) {
	        Node temp = new Node(data);

	        if (start == null) {
	            start = temp;
	            end = temp;
	        } else {
	            end.next = temp;
	            temp.prev = end;
	            end = temp;
	        }
	    }

	    int countNodes() {
	        int count = 0;
	        Node p = start;
	        while (p != null) {
	            count++;
	            p = p.next;
	        }
	        return count;
	    }

	    void addPosition(int data, int pos) {
	        Node temp = new Node(data);
	        int n = countNodes();

	        if (start == null || pos <= 1) {
	            addBeg(data);
	            return;
	        }

	        if (pos > n) {
	            addEnd(data);
	            return;
	        }

	        Node p;
	        int i;

	        if (pos <= n / 2) {
	            p = start;
	            i = 1;
	            while (i < pos - 1) {
	                p = p.next;
	                i++;
	            }
	        }
	        else {
	            p = end;
	            i = n;
	            while (i > pos - 1) {
	                p = p.prev;
	                i--;
	            }
	        }

	      
	        temp.next = p.next;
	        temp.prev = p;

	        if (p.next != null)
	            p.next.prev = temp;

	        p.next = temp;
	    }

	   
	    void display() {
	        Node p = start;
	        System.out.print("List: ");
	        while (p != null) {
	            System.out.print(p.data + " ");
	            p = p.next;
	        }
	        System.out.println();
	    }
}