import java.util.Scanner;
class Bank {
    void approveLoan(Student s) {
        if (s.getPercentage() > 80) {
            System.out.println("Loan Approved for Student: 2 lakh");
        } else if (s.getPercentage() > 60) {
            System.out.println("Loan Approved for Student: 1 lakh");
        } else if (s.getPercentage() > 40) {
            System.out.println("Loan Approved for Student: 50k");
        } else {
            System.out.println("Loan Denied for Student");
        }
    }

    void approveLoan(Employee e) {
        if (e.getAnnualSalary() > 1200000) {
            System.out.println("Loan Approved for Employee: 7 lakh");
        } else if (e.getAnnualSalary() > 1000000) {
            System.out.println("Loan Approved for Employee: 6 lakh");
        } else {
            System.out.println("Loan Denied for Employee");
        }
    }
}

class Student {
    int rollno;
    String name;
    double percentage;

    // default constructor
    Student() {
        this.rollno = 7;
        this.name = "atul";
        this.percentage = 74;
    }

    // parameterized constructor
    Student(int r, String n, double p) {
        this.rollno = r;
        this.name = n;
        this.percentage = p;
    }

    // setters
    void setRollno(int r) {
        this.rollno = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setPercentage(double p) {
        this.percentage = p;
    }

    // getters
    int getRollno() {
        return this.rollno;
    }

    String getName() {
        return this.name;
    }

    double getPercentage() {
        return this.percentage;
    }

    void display() {
        System.out.println("Student Roll No: " + rollno);
        System.out.println("Student Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}

class Employee {
    int id;
    String name;
    double annualSalary;

    // default constructor
    Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.annualSalary = 0.0;
    }

    // parameterized constructor
    Employee(int i, String n, double a) {
        this.id = i;
        this.name = n;
        this.annualSalary = a;
    }

    // setters
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setAnnualSalary(double a) {
        this.annualSalary = a;
    }

    // getters
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getAnnualSalary() {
        return this.annualSalary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Annual Salary: " + annualSalary);
    }
}

class Test {
    public static void main(String args[]) {

             Scanner sc =  new Scanner(System.in);

             Bank b1 = new Bank();

 	     System.out.println("Enter the rollno :");
	     int r = sc.nextInt();
	     System.out.println("Enter the name :");
	     String n = sc.nextLine();
	     System.out.println("Enter the percentage : ");
	     double p = sc.nextDouble();

 	     Student s1 = new Student(r,n,p);
	     s1.display();
             b1.approveLoan(s1);

             // Employee Input
             System.out.print("Enter Employee ID: ");
             int id = sc.nextInt();
           
             System.out.print("Enter Employee Name: ");
             String ename = sc.nextLine();
             System.out.print("Enter Annual Salary: ");
             double salary = sc.nextDouble();
             Employee e1 = new Employee(id, ename, salary);
             
	     e1.display();
             b1.approveLoan(e1);


           
             
   }
}
