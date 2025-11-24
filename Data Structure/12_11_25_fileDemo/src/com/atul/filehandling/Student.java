package com.atul.filehandling;

import java.io.Serializable;

public class Student implements Serializable {
     int id;
     String name;
     double salary;
	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
     
     
}
