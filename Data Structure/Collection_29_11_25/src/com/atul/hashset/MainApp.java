package com.atul.hashset;

import java.util.HashSet;


class Student {
	int roll;
	double marks;
	String name;
	
	public Student() {
		this.roll = 101;
		this.marks = 55;
		this.name = "atul";
	}
	
	public Student(int id, double marks, String name) {
		super();
		this.roll = id;
		this.marks = marks;
		this.name = name;
	}
//	@Override
//	public int compareTo(Student s1) {
//		System.out.println("inside compareTo");
////		return (int) (this.marks-s1.marks);
////		return this.name.compareTo(s1.name);
//		
//		return this.roll - s1.roll;
//	}
	@Override
	public String toString() {
		return "Student roll=" + roll + ", marks=" + marks + ", name=" + name +"\n";
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

	@Override
	public boolean equals(Object obj) {
		System.out.println("inside equals");
		Student s1 = (Student)obj;
		
		if(this.roll==s1.roll) {
			return true;
		}else {
			return false ;
		}
	}

	@Override
	public int hashCode() {
		System.out.println("inside hashcode ");
		return this.roll;
	}

	
	
}
public class MainApp {

	public static void main(String[] args) {
	    HashSet<Student> h1 = new HashSet<Student>();
	    
	    h1.add(new Student(57,450,"rahul"));
	    h1.add(new Student(75,650,"atul"));
	    h1.add(new Student(7,560,"dhoni"));
	   
	    h1.add(new Student(7,560,"dhoni"));
	    h1.add(new Student(71,560,"dhoni"));
	    h1.add(new Student(57,450,"rahul"));
	    h1.add(new Student(75,650,"atul"));
	    h1.add(new Student(78,560,"dhoni"));
	 
	    h1.add(new Student(5,560,"dhoni"));
	    h1.add(new Student(76,560,"dhoni"));
	    	System.out.println(h1);
//	    if(h1.contains(new Student(57,450,"rahul")))
//		{
//			System.out.println("found");
//		} 
//		else 
//		{
//			System.out.println("not found");
//		}
	}

}
