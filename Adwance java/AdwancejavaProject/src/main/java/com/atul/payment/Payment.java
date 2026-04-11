package com.atul.payment;

import java.sql.Timestamp;

public class Payment {

	    private int paymentId;
	    private int orderId;
	    private String userName;
	    private double amount;
	    private Timestamp paymentDate;
	    	
	    
	    
	    public Payment( int orderId, String userName, double amount, Timestamp paymentDate) {
			super();
			
			this.orderId = orderId;
			this.userName = userName;
			this.amount = amount;
			this.paymentDate = paymentDate;
		}
	    
		public Payment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getPaymentId() { return paymentId; }
	    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

	    public int getOrderId() { return orderId; }
	    public void setOrderId(int orderId) { this.orderId = orderId; }

	    public String getUserName() { return userName; }
	    public void setUserName(String userName) { this.userName = userName; }

	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }

	    public Timestamp getPaymentDate() { return paymentDate; }
	    public void setPaymentDate(Timestamp paymentDate) { this.paymentDate = paymentDate; }
	
}

    

