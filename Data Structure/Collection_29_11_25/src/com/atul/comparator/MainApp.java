package com.atul.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student{
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
	public String toString() {
		return "Student roll=" + roll + ", marks=" + marks + ", name=" + name + "\n";
	}	
	
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2){
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.roll-s2.roll;
	}
	
	
}
public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student (57,450,"Sachin"));
		a1.add(new Student (34,590,"rahul"));
		a1.add(new Student (88,700,"Dhoni"));
		
		MyComparator m1 = new MyComparator();
		
		System.out.println("Before "+a1);
		
		Collections.sort(a1,m1);
		
		System.out.println("After "+a1);
		

	}

}
