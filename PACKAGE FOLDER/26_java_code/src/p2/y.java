package p2;

import p1.A;

class y extends A {
	void myFun() {
		System.out.println("within package y");
		A ref = new A();
		ref.myFun();
	}
}
