package com.atul.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {
	
		
		public static void main(String[] args) {
			
			Student s= new Student(1,"atul",new Address("pune"));
			
			Configuration cfg = new Configuration();
			cfg.configure("Config.xml");
			
			SessionFactory factory = cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction tr  = session.beginTransaction();
			
			session.persist(s);
			tr.commit();
			session.close();

		}
	
}
