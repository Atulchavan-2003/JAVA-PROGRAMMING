package com.atul.Observer;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherStation implements Observable{
    
	
	float temp;
	List<Observer> m1 = new ArrayList();
	
	public WeatherStation() {
		
	}
	
	void tempChange(float temp){
		this.temp=temp;
		notifyall();
		
	}
	public void register(Observer r) {
		m1.add(r);
		 System.out.println("Added subscriber: " + r.getUser());
		display();
	}

	private void display() {
		for(Observer ref:m1) {
			Mobile m = (Mobile)ref;
			System.out.println(m.getUser());
		}
		
	}

	@Override
	public void unregister(Observer ob) {
//		for(Observer ref : m1) {
//			if(ref.equals(ob)) {
//				
//				m1.remove(ref);
//				display();
//			}
//		}
		
		Iterator<Observer> itr = m1.iterator();

	    while (itr.hasNext()) {
	        Observer ref = itr.next();

	        if (ref.equals(ob)) {
	            itr.remove(); 
	            display();
	        }
	    }
		
	}

	@Override
	public void notifyall() {
		for(Observer ref : m1) {
			ref.update(temp);
		}
		
	}

	

	

}
