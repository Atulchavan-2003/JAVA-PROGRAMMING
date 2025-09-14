import java.util.Scanner;
class Calculator {
    int a, b;
    double d1, d2;

    // default constructor
    Calculator() {
        this.a = 2;
        this.b = 4;
        this.d1 = 232;
        this.d2 = 12;
    }

    // parameterized constructor
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Calculator(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    // setters
    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void setD1(double d1) {
        this.d1 = d1;
    }

    void setD2(double d2) {
        this.d2 = d2;
    }

    // getters
    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    double getD1() {
        return this.d1;
    }

    double getD2() {
        return this.d2;
    }


       // overloaded add methods
    void add(int a, int b) {
        System.out.println("Result is " + (a + b));
        System.out.println("void add(int a,int b)");
    }

    void add(int a, double d1) {
        System.out.println("Result is " + (a + d1));
        System.out.println("void add(int a,double d1)");
    }

    void add(double d1, double d2) {
        System.out.println("Result is " + (d1 + d2));
        System.out.println("void add(double d1,double d2)");
    }

    void add(double d1, int a) {
        System.out.println("Result is " + (d1 + a));
        System.out.println("void add(double d1,int a)");
    }
}

class Test {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();


        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();

        Calculator c1 = new Calculator(a, b);
        Calculator c2 = new Calculator(d1, d2);

        c1.display();
        c2.display();

       
        c1.add(a, b);
        c1.add(a, d1);
        c2.add(d1, d2);
        c2.add(d1, a);       
    }
}
