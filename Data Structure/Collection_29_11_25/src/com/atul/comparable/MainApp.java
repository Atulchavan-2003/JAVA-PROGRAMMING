package com.atul.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

 class Student implements Comparable<Student>{
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
	@Override
	public int compareTo(Student s1) {
		System.out.println("inside compareTo");
//		return (int) (this.marks-s1.marks);
//		return this.name.compareTo(s1.name);
		
		return this.roll - s1.roll;
	}
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

	
	
}
public class MainApp {
	public static void main1(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student (57,450,"Sachin"));
		a1.add(new Student (34,590,"rahul"));
		a1.add(new Student (88,700,"Dhoni"));
		
		System.out.println(a1);
		
		Collections.sort(a1);
		
		System.out.println(a1);
		
		if(a1.contains(new Student(34,590,"rahul")))
		{
			System.out.println("found");
		} 
		else 
		{
			System.out.println("not found");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		
		t1.add(new Student (57,450,"Sachin"));
		t1.add(new Student (34,590,"rahul"));
		t1.add(new Student (88,700,"Dhoni"));
		
		System.out.println(t1);
		if(t1.contains(new Student(34,590,"rahul")))
		{
			System.out.println("found");
		} 
		else 
		{
			System.out.println("not found");
		}
		
	}
	public static void main2(String[] args) {
		TreeSet t1 = new TreeSet();
		
		Integer a = 56;
		t1.add(a);
		t1.add(14);
		t1.add(1);
		
		System.out.println(t1);
		
		
		
	}
	

}
