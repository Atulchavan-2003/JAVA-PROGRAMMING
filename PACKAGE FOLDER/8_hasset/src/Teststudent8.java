import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student implements Comparable<Student> {
    int rollNo;
    double marks;
    String name;
    
	Student() {
		this.rollNo = 10;
		this.marks = 8;
		this.name = "atul";
	}

	Student(int rollNo, double marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	
	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	double getMarks() {
		return marks;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

//	public int compareTo(Object o) {
//		Student  s1 = (Student)o;
//		return this.rollNo - s1.rollNo;
//	}

	public boolean equals(Object obj) {
		System.out.println("inside equals");
		Student s1 = (Student) obj;
		if (this.rollNo == s1.rollNo) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Student s1) {
	   System.out.println("inside compareto");
		return  this.rollNo - s1.rollNo;
	}

	
	
}// Student
public class Teststudent8 {
	public static void main1(String[] args) {
		Set<Student> h1 = new HashSet<Student>();
		h1.add(new Student(57, 450, "Sachin"));
		h1.add(new Student(34, 590, "Rahul"));
		h1.add(new Student(88, 700, "Dhoni"));
         
		
		System.out.println(h1);	
		for(Student s1:h1) {
			System.out.println("for each loop"+s1.getName());
		}
	}
	public static void main2(String[] args) {
		List<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));

		System.out.println(a1);
	}
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));

		System.out.println("before"+a1);
		Collections.sort(a1);
		System.out.println("after"+a1);
		
		for(Student s1:a1) {
			System.out.println("for each loop"+s1.getName());
		}
		
	}
}
