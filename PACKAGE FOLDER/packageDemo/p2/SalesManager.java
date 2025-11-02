package p2;

import p1.Employee;

public class SalesManager extends Employee {
	 double insentive;
	 int target;
	 
	SalesManager() {
		this.insentive = 0;
		this.target = 0;
	}

	SalesManager(int m,String n,double s,double insentive, int target) {
		super(m,n,s);
		this.insentive = insentive;
		this.target = target;
	}
	
	public void display() {
		super.display();
		System.out.println("insentive is :"+this.insentive);
		System.out.println("target is:"+this.target);
	}
}
