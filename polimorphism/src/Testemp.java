

abstract class Employee {
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
    abstract double calsal();
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
	
	double getInsentive() {
		return insentive;
	}

	void setInsentive(double insentive) {
		this.insentive = insentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	void display() {
		super.display();
		System.out.println("insentive is :"+this.insentive);
		System.out.println("target is:"+this.target);
	}
	double calsal(){
		return this.salary + this.insentive + this.insentive + this.target;
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
	double calsal(){
		return this.salary + this.commision;
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
	double calsal(){
		return this.salary + this.allownce;
	}
	
	
}

class Testemp {
	
	public static void main(String args[]) {
	      Employee e1;
	      
	      e1 = new SalesManager2(1,"atul",200000,23,56);
		  Testemp.myfun(e1);
		  
		  e1=new Hr(3,"rahul",50000,6523);
		  Testemp.myfun(e1);
	}
	static void myfun(Employee e1) {
		System.out.println(e1.getName());
		System.out.println(e1.calsal());
		
		if (e1 instanceof SalesManager2) {
			SalesManager2 s1 = (SalesManager2)e1;
			System.out.println(s1.getInsentive());
		}
		
	}
	
    public static void main1(String[] args) {
         Employee e1 ;
//         e1.display();
//         System.out.println(e1.calsal());  
         
         e1 = new SalesManager2(1,"atul",200000,23,56);
         e1.display();
         System.out.println(e1.calsal());  
         
         e1=new Hr(3,"rahul",50000,6523);
         e1.display();
         System.out.println(e1.calsal());  
         
         e1 = new Admin2(4,"akash",62300,5200);
         e1.display();
         e1.calsal();
    }
}


