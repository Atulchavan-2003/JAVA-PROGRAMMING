

class Employee {
    int memberId;
    String name;
    double salary;

    // default constructor
    Employee() {
        this.memberId = 0;
        this.name = "Unknown";
        this.salary = 0.0;
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
class SalesManager2 extends Employee{
	 double insentive;
	 int target;
	 
	SalesManager2() {
		this.insentive = 0;
		this.target = 0;
	}

	SalesManager2(int m,String n,double s,double insentive, int target) {
		super(m,n,s);
		this.insentive = insentive;
		this.target = target;
	}

	void display() {
		super.display();
		System.out.println("insentive is :"+this.insentive);
		System.out.println("target is:"+this.target);
	}
	
	 
}
class Hr extends Employee{
	double commision ;
	
	Hr() {
		this.commision=0;
	}

	Hr(int m, String n, double s,double commision) {
		super(m, n, s);
		this.commision=commision;
	}
	void display(){
		super.display();
		System.out.println("commision is "+this.commision);
	}

     
}
class Admin2 extends Employee{
	double allownce;

	Admin2() {
		super();
		this.allownce = 0;
	}

	Admin2(int m, String n, double s,double allownce) {
		super(m, n, s);
		this.allownce=allownce;
	}
	void display(){
		super.display();
		System.out.println("allownce is:"+this.allownce);
	}
	
}

class Testemp {
    public static void main(String[] args) {
         Employee e1 = new Employee();
         e1.display();
         Hr h = new Hr();
         h.display();
         Admin2 a = new Admin2(1,"rahul",2000,200);
         a.display();
    }
}

