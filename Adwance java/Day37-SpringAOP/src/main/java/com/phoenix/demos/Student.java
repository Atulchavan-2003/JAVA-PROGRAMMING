package com.phoenix.demos;

public class Student {
	
	boolean valid;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(boolean v1)
	{
		valid=v1;
	}
	
	public boolean getValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void takeExams()
	{
		//In classic programming approach
		//checking of fees would be implemented as part of this method.
		//boolean valid=utility.checkIfFessPaid(id);
		
		//In AOP, we identify the aspect, and configure it for flexibility
		if(valid==true)
		{
			System.out.println("Appearing for exams");			
		}
		else
		{
			System.out.println("You cannot appear for exam");
		}

	}
	
	public void takeTest(String ref)
	{
		System.out.println("Test method");
	}

	public void conductExams()
	{
		System.out.println("Conduct method");
	}
}
