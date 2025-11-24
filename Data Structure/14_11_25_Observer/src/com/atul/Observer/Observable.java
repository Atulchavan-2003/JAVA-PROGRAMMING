package com.atul.Observer;

public interface Observable {
	  void register(Observer m);
	  void unregister(Observer n);
	  void notifyall();
	
}
