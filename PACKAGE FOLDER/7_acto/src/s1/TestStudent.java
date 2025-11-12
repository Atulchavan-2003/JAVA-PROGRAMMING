package s1;

import java.util.ArrayList;
import java.util.TreeSet;



class Student implements Comparable<Student>  {
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
	
}// Student class Ends here
class TestStudent{
	public static void main1(String[] args) {

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));

		System.out.println(a1);

		if (a1.contains(new Student(34, 590, "Rahul")))
		{
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

	public static void main (String[] args) {

		TreeSet<Student> t1=new TreeSet<Student>();
		
		t1.add(new Student(10,569,"Sachin"));
		t1.add(new Student(11,256,"atul"));
		t1.add(new Student(12,786,"atul"));
		System.out.println(t1);
	
		if(t1.contains(new Student(11,256,"atul"))) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}
}
