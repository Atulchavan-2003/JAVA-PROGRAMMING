package com.atul.team;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		Set<Player> batters = new HashSet<Player>();
		
		Team t1 = new Team(1,"Mumbai Indian",batters);
		Player p1 = new Player(1,"rohit",45,t1);
		
		t1.allBatters.add(p1);
		
		Configuration cfg = new Configuration();
		cfg.configure("Config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tr  = session.beginTransaction();
		
		session.persist(t1);
		tr.commit();
		session.close();
		
	}
	
	
	
	
	public static void main1(String[] args) {
		
	
		
		Configuration cfg = new Configuration();
		cfg.configure("Config.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t1  = session.beginTransaction();
		
		session.persist(t1);
		t1.commit();
		session.close();

	}
}
