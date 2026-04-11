package com.atul.Aop;

import org.aspectj.lang.JoinPoint;

public class CheckValidity {
	public CheckValidity() {
		// TODO Auto-generated constructor stub
	}
	
	public void hasPaid(JoinPoint jp) //This is a service method
	{
		Student target=(Student)jp.getTarget();
		System.out.println("Checking if fees paid or not");
		System.out.println(jp.getTarget().getClass().getName());
		target.valid=true;
	}
}
