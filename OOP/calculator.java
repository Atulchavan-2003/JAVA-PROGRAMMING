class Calculator {

	void add(int a, int b) {
		System.out.println("Result is" + (a + b));
		System.out.println("void add(int a,int b)");
	}

	void add(int a, double d1) {
		System.out.println("Result is" + (a + d1));
		System.out.println("void add(int a,double d1)");
	}

	void add(double d1, double d2) {
		System.out.println("Result is" + (d1 + d2));
		System.out.println("void add(double d1,double d2)");
	}

	void add(double d1, int a) {
		System.out.println("Result is" + (d1 + a));
		System.out.println("void add(double d1,int a)");
	}
}// Class Calculator ends here
	///////

class Testcal {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int a = 10, b = 20;
		c1.add(10, 10.2);
		c1.add(a, b);
		c1.add(10.2, 20.2);
	}
}