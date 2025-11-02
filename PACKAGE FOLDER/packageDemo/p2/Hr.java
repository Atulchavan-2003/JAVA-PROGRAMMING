package p2;

import p1.Employee;

public class Hr extends Employee{
	
double commision ;
	
	Hr() {
		this.commision=0;
	}

	Hr(int m, String n, double s,double commision) {
		super(m, n, s);
		this.commision=commision;
	}
	
	double getCommision() {
		return commision;
	}

	void setCommision(double commision) {
		this.commision = commision;
	}

	public void display(){
		super.display();
		System.out.println("commision is "+this.commision);
	}
}
