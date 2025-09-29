package p1;

class B extends A{
	void myFun() {
		System.out.println("within package b");
		A ref = new A();
		ref.myFun();
	}
}
