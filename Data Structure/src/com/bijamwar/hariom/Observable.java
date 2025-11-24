package com.bijamwar.hariom;

public interface Observable {
	void register(Observer obs);
	void unRegister(Observer obs);
	void notifyAllObservers();
	
}
