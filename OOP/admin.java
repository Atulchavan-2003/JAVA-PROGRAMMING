import java.util.Scanner;

class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    // Default Constructor
    Admin() {
        this.id = 5;
        this.name = "atul";
        this.salary = 20000;
        this.allowance = 565;
    }

    // Parameterized Constructor
    Admin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    // Setters
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
    }

    // Getters
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    double getAllowance() {
        return allowance;
    }

    // Display Method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }

    void ak() {
        System.out.println("chavan atul");
    }
} // Admin class end here

class TestAdmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Admin a1 = new Admin();
        a1.display();

        // User input
        System.out.print("\nEnter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();

        // Using parameterized constructor
        Admin a2 = new Admin(id, name, salary, allowance);

        a2.display();

        // Using setters
        a1.setId(101);
        a1.setName("SetBySetter");
        a1.setSalary(50000);
        a1.setAllowance(6000);

        a1.display();

        // Using getters
        System.out.println("ID       : " + a2.getId());
        System.out.println("Name     : " + a2.getName());
        System.out.println("Salary   : " + a2.getSalary());
        System.out.println("Allowance: " + a2.getAllowance());
    }
}
