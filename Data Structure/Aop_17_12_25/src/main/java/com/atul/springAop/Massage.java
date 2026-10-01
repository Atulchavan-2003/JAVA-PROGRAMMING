package com.atul.springAop;

public class Massage {
	String msg;
	String to ;
	String from;
	public Massage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Massage(String msg, String to, String from) {
		super();
		this.msg = msg;
		this.to = to;
		this.from = from;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	
}
