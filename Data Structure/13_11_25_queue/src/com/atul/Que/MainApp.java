package com.atul.Que;

public class MainApp {

	public static void main(String[] args) {
		Que q1 = Que.getObject();
		q1.send("hello");
		q1.retriv();
		q1.retriv();
		q1.send("atul");
		q1.send("how are you ");
		q1.send("fine");
		

	}

}
