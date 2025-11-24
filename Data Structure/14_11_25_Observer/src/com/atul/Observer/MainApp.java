package com.atul.Observer;

public class MainApp {

	public static void main(String[] args) {
		Observer ob1= new Mobile("atul");
		Observer ob2 = new Mobile("sandeep");
		Observer ob3 = new Mobile("gopal");
		Observer ob4 = new Mobile("soham");
		
		WeatherStation w1 = new WeatherStation();
		
		w1.register(ob1);
		w1.register(ob2);
		w1.register(ob4);
		
		w1.tempChange(12);
		
		w1.unregister(ob2);

	}

}
