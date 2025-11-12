package p4;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class EmployeeDao {
	static Employee[] empArr;
	static int empCount;
	
	static {
		empArr=new Employee[20];
		empCount=0;
		empArr[empCount++] = new HR(101, "rahul", 54000, 5000);
	    empArr[empCount++] = new SalesManager(201, "akash", 60000, 12, 8000);
	    empArr[empCount++] = new Admin(301, "umesh", 70000, 10000);
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
