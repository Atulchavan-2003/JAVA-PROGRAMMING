package com.atul.Observer;

public class Mobile implements Observer {
	String temp;
	String user;
	public Mobile(String user) {
		super();
		this.user = user;
	}
	@Override
	public void update(float temp) {
		System.out.println("value change for this obj"+ temp+" " + user);
		
	}
	
	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	
	
}
