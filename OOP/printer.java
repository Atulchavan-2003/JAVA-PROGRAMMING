import java.util.Scanner;

class Printer {
     int a;
     char c;
     String str;

    // default constructor
    Printer() {
        this.a = 5;
        this.c = 'a';
        this.str = "atul";
    }

    // parameterized constructor
    Printer(int a, char c, String str) {
        this.a = a;
        this.c = c;
        this.str = str;
    }

    // setters
    void setA(int a) {
        this.a = a;
    }

    void setC(char c) {
        this.c = c;
    }

    void setStr(String str) {
        this.str = str;
    }

    // getters
    int getA() {
        return this.a;
    }

    char getC() {
        return this.c;
    }

    String getStr() {
        return this.str;
    }

    // display method
    void display() {
        System.out.println("Integer: " + this.a);
        System.out.println("Character: " + this.c);
        System.out.println("String: " + this.str);
    }

    // overloaded methods
    void print(int a) {
        System.out.println("Printing int: " + a);
    }

    void print(char c) {
        System.out.println("Printing char: " + c);
    }

    void print(String str) {
        System.out.println("Printing string: " + str);
    }
}

class TestPrit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
	 

	
        System.out.print("Enter a string: ");
	sc.nextLine();
        String str = sc.nextLine();

        // using parameterized constructor
        Printer p1 = new Printer(a, c, str);

        // display
        p1.display();

        // calling overloaded methods
        p1.print(p1.getA());
        p1.print(p1.getC());
        p1.print(p1.getStr());
    }
}
