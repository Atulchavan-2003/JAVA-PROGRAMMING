package com.bijamwar.hariom;

import java.util.ArrayList;

public class WeatherStation implements Observable {

	ArrayList <Observer> users= new ArrayList<Observer>();
	float temperature;
	
	public WeatherStation() {
		
	}


	public void register(Observer obs) {
		users.add(obs);
	}


	public void unRegister(Observer obs) {
		if(users.contains(obs))
		{
			users.remove(obs);
		}
		else
		{
			System.out.println("Observer doesnt exist");
		}
		
	}

	@Override
	public void notifyAllObservers() {

		
		for(Observer ref:users)
		{
			ref.update(temperature);
		}
		
	}
	
	public void changeTemperature(float temperature)
	{
		this.temperature=temperature;
		temperatureChanged();
	}

	public void temperatureChanged() {
		notifyAllObservers();
		
	}

}
