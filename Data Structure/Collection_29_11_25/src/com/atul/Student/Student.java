package com.atul.Student;



public class Student {
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
	
}