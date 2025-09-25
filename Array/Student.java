import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double marks;

    // Default constructor
    Student() {
        this.rollno = 1;
        this.name = "atul";
        this.marks = 55;
    }

    // Parameterized constructor
    Student(int r, String n, double m) {
        this.rollno = r;
        this.name = n;
        this.marks = m;
    }

    // Setters
    void setRoll(int r) {
        this.rollno = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    // Getters
    int getRoll() {
        return this.rollno;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    // Display Method
    void display() {
        System.out.println("Roll: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
} // Student class end here

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Marks: ");
        double m = sc.nextDouble();

        Student s1 = new Student(r, n, m);

        Student s2 = new Student();
        s2.setRoll(2);
        s2.setName("Sandeep");
        s2.setMarks(85);

     
        System.out.println(" Student 1 Details ");
        s1.display();

        System.out.println(" Student 2 Details ");
        s2.display();
    }
}
