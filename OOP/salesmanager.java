import java.util.Scanner;

class SalesManager {
    int id;
    int bonus;
    String name;
    double salary;
    double target;
    double incentive;

    SalesManager() {
        this.name = "atul ";
        this.salary = 500000;
        this.target = 1000000;
        this.incentive = 5000;
    }

    SalesManager(int i, String n, double s, double t, double inc) {
        this.id = i;
        this.name = n;
        this.salary = s;
        this.target = t;
        this.incentive = inc;
        this.bonus = i;
    }

    // Setters
    void setId(int i) {
        id = i;
    }

    void setName(String n) {
        name = n;
    }

    void setSalary(double s) {
        salary = s;
    }

    void setTarget(double t) {
        target = t;
    }

    void setIncentive(double inc) {
        incentive = inc;
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

    double getTarget() {
        return target;
    }

    double getIncentive() {
        return incentive;
    }

    // Display method
    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Target: " + target);
        System.out.println("Incentive: " + incentive);
    }
} // SalesManager class end

class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        SalesManager sm1 = new SalesManager();
        System.out.println("Enter the id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the salary");
        double sal = sc.nextDouble();
        System.out.println("Enter the target");
        double tar = sc.nextDouble();
        System.out.println("Enter the incentive");
        double incen = sc.nextDouble();
        SalesManager sm2 = new SalesManager(id, name, sal, tar, incen);

        sm2.display();

        sm1.setId(101);
        sm1.setName("Atul");
        sm1.setSalary(60000);
        sm1.setTarget(100000);
        sm1.setIncentive(10000);

        sm1.display();
        sm2.display();

    }
}
