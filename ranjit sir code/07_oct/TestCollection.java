import java.util.ArrayList;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	int roll;
	double marks;
	String name;

	public int compareTo(Student s2) {
		System.out.println("inside compareTo");
		return this.roll - s2.roll;
	}

	/*
	 * public int compareTo(Object o) { Student s1= (Student)o; return
	 * this.roll-s1.roll; //return (int) (this.marks-s1.marks); //return
	 * this.name.compareTo(s1.name);
	 * 
	 * }
	 */

	public Student() {
		this.roll = 101;
		this.marks = 7;
		this.name = "not given";

	}

	public Student(int id, double marks, String name) {
		this.roll = id;
		this.marks = marks;
		this.name = name;
	}

	public int getId() {
		return roll;
	}

	public void setId(int id) {
		this.roll = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\n Student roll=" + roll + ", marks=" + marks + ", name=" + name;
	}


	public boolean equals(Object obj) {
		System.out.println("inside equals");
		Student s1 = (Student) obj;
		if (this.roll == s1.roll) {
			return true;
		} else {
			return false;
		}
	}
}// class Student ends here

public class TestCollection {

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

	public static void main(String[] args) {

		TreeSet<Student> t1 = new TreeSet<Student>();
		t1.add(new Student(57, 450, "Sachin"));
		t1.add(new Student(34, 590, "Rahul"));
		t1.add(new Student(88, 700, "Dhoni"));

		System.out.println(t1);

		if (t1.contains(new Student(34, 590, "Rahul")))

		{
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		
	}

}
