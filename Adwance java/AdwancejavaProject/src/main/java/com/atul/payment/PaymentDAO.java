package com.atul.payment;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Utility.DataBaseConnectivity;

public class PaymentDAO {
	

		public static List<Payment> getAllPayments() {
	        List<Payment> payments = new ArrayList<>();

	        try {
	           
	        	 Connection con = DataBaseConnectivity.getConnection1();

	            String sql = "select * from payments";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                Payment p = new Payment();
	                p.setPaymentId(rs.getInt("paymentId"));
	                p.setOrderId(rs.getInt("orderId"));
	                p.setUserName(rs.getString("userName"));
	                p.setAmount(rs.getDouble("amount"));
	                p.setPaymentDate(rs.getTimestamp("paymentDate"));
	                payments.add(p);
	            }

	            rs.close();
	            ps.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return payments;
	    }
}
