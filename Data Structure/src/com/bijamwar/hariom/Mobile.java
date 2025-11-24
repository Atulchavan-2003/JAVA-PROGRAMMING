package com.bijamwar.hariom;

public class Mobile implements Observer {
	
	float temperature;
	WeatherStation ws1;
	
	public Mobile(WeatherStation ws1) {
	
		this.ws1 = ws1;
		ws1.register(this);
	}
	

	public Mobile() {

	}

	public void  display()
	{
		System.out.println("temperature is "+temperature);
	}
	public void update(float temp) {
		this.temperature=temp;
		display();
	}
}
