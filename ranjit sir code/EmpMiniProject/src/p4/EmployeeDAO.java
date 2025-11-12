package p4;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class EmployeeDAO {
	static Employee[] empArr;
	static int empCount;
	
	static {
		empArr=new Employee[20];
		empCount=0;
		empArr[empCount++] = new HR(101, "Ranjit", 50000, 5000);
	    empArr[empCount++] = new HR(102, "Amit", 48000, 4500);
	    empArr[empCount++] = new HR(103, "Sneha", 47000, 4000);
	    empArr[empCount++] = new SalesManager(201, "Karan", 60000, 12, 8000);
	    empArr[empCount++] = new SalesManager(202, "Meena", 58000, 15, 7500);
	    empArr[empCount++] = new SalesManager(203, "Rohit", 62000, 10, 9000);
	    empArr[empCount++] = new Admin(301, "Pragati", 70000, 10000);
	    empArr[empCount++] = new Admin(302, "Isha", 68000, 9500);
	    empArr[empCount++] = new Admin(303, "Pooja", 72000, 11000);
	    empArr[empCount++] = new Admin(304, "Shubham", 75000, 12000);
	}
	public boolean addEmployee(Employee e) {
        if (empCount < empArr.length - 1) {
            empArr[empCount++] = e;
            return true;
        }
        return false;
    }
	
    public Employee searchEmployeeById(int id) {
        for (int i = 0; i < empCount; i++) {
            if (empArr[i].getId() == id) {
                return empArr[i];
            }
        }
        return null;
    }

  
    public boolean updateEmployee(int id, double newSalary) {
        Employee emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < empCount; i++) {
            if (empArr[i].getId() == id) {
                for (int j = i; j < empCount; j++) {
                    empArr[j] = empArr[j + 1];
                }
                empArr[--empCount] = null;
                return true;
            }
        }
        return false;
    }
 
    public void displayAll() {
        for (int i = 0; i <empCount; i++) {
            System.out.println(empArr[i]);
        }
    }

    public Employee[] getAllEmployee() {
        Employee[] result = new Employee[empCount];
        for (int i = 0; i < empCount; i++) {
            result[i] = empArr[i];
        }
        return result;
    }
    public static int getEmpCount() {
        return empCount;
    }


	
}
