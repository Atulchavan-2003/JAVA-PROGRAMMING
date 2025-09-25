import java.util.Scanner;

class Employee {
    int memberId;
    String name;
    double salary;

    // default constructor
    Employee() {
        this.memberId = 5;
        this.name = "yogesh";
        this.salary = 12000;
    }

    // parameterized constructor
    Employee(int m, String n, double s) {
        this.memberId = m;
        this.name = n;
        this.salary = s;
    }

    // setters
    void setMemberId(int a) {
        this.memberId = a;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    // getters
    int getMemberId() {
        return this.memberId;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    // display method
    void display() {
        System.out.println("Employee ID: " + this.memberId);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input for e1
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // parameterized constructor
        Employee e1 = new Employee(id, name, salary);

        // default constructor 
        Employee e2 = new Employee();
        e2.setMemberId(2);
        e2.setName("Sandeep");
        e2.setSalary(60000);

       
        System.out.println("Employee 1 Details ");
        e1.display();

        System.out.println("Employee 2 Details");
        e2.display();
    }
}
