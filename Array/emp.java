
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

class Testemp {
    public static void main(String[] args) {
       
	 Employee[] arr = new Employee[5]; 
	arr[0] = new Employee(); 
	arr[1] = new Employee(1,"atul",20000); 
	arr[2] = new Employee(); 
	arr[3] = new Employee(); 
	arr[4] = new Employee(); 
        for(int i = 0;i<arr.length;i++){
	      System.out.println(arr[i]);
	}

	for(int i = 0;i<arr.length;i++){
	     arr[i].display();
	}
	
	
    }
}