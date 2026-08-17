package com.atul.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.atul.entities.Student;

public class App{
	public static void main(String[] args) {
		
		
		Student student = new Student();
		
		 student.setId(1);
	        student.setName("Atul");
	        student.setCollege("matoshree");
	        student.setMark(74);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/atul/config/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		
		
		
//		try {
//			session.persist(student);
//			
//			transaction.commit();
//			
//			System.out.println("user saved succesfully");
//			
//			
//		}catch(Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//		}
		
		// select
		try {
			Student student1 = session.get(Student.class, 1);
			
			System.out.println(student1.getName());
			
		}catch(Exception e) {
			System.out.println("not found");
		}	
	}
}