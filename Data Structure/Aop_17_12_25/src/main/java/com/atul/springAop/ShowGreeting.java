package com.atul.springAop;

public class ShowGreeting implements Greetable{
	
	String msg;
	String from;
	
	
	public ShowGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	// parameter constructor
	public ShowGreeting(String msg,String from) {
		this.msg = msg;
		this.from = from;
	}
	


	@Override
	public void greet(){

		System.out.println(msg+" "+from);
	}

	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	

	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


}
