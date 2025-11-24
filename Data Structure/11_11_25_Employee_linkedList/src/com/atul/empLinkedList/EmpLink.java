package com.atul.empLinkedList;


public class EmpLink {
	int empId;
	String name;
	double salary;
	
	 Node2 start = null;
	 Node2 end = null;
	 
	public EmpLink(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	  
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
		
	  void addBeg(EmpLink data) {
	        Node2 temp = new Node2(data);

	        if (start == null) {
	            start = end = temp;
	        } else {
	            temp.next = start;
	            start.prev = temp;
	            start = temp;
	        }
	    }
	  void addEnd(EmpLink data) {
	        Node2 temp = new Node2(data);

	        if (start == null) {
	            start = temp;
	            end = temp;
	        } else {
	            end.next = temp;
	            temp.prev = end;
	            end = temp;
	        }
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
	  void addPosition(EmpLink data,int p) {
		  
	  }
	  void deletePosi(EmpLink data,int p) {
		  
	  }
	  void display() {
	        Node2 itr = start;
	        System.out.print("List: ");
	        while (itr != null) {
	            System.out.print(toString(itr.data) + " ");
	            itr = itr.next;
	        }
	        System.out.println();
	    }

    String toString(EmpLink data) {
		
		return data.empId+" "+data.name +" "+data.salary+" ";
	}
 

}
