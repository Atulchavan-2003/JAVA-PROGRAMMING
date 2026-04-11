package com.atul.card;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utility.DataBaseConnectivity;

public class CardDAO {

public static boolean isValidCard(String cardNo, String cvv) {

    boolean status = false;

    try {
    	
    	    System.out.println("inside card valide or not ");
        Connection con = DataBaseConnectivity.getConnection1();
        PreparedStatement ps = con.prepareStatement("select * from card_details where card_number=? and cvv=?");

        ps.setString(1, cardNo);
        ps.setString(2, cvv);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            status = true;
        }

    } catch(Exception e) {
        e.printStackTrace();
    }

    return status;
}
}
