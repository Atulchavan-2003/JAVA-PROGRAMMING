package p2;

import p1.Employee;

public class Admin extends Employee {
	double allownce;

	Admin() {
		super();
		this.allownce = 0;
	}

	Admin(int m, String n, double s,double allownce) {
		super(m, n, s);
		this.allownce=allownce;
	}
	void calsal() {
		
	}
	public void display(){
		super.display();
		System.out.println("allownce is:"+this.allownce);
	}
}
