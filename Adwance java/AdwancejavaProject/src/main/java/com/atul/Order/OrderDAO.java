package com.atul.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Utility.DataBaseConnectivity;

public class OrderDAO {

   
    public static int saveOrder(Order order) {

        int status = 0;
        try {
            Connection con = DataBaseConnectivity.getConnection1();

            String sql = "insert into orders (user_name, product_id, price, payment_mode) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, order.getUserName());
            ps.setInt(2, order.getProductId());
            ps.setDouble(3, order.getPrice());
            ps.setString(4, order.getPaymentMode());

            status = ps.executeUpdate(); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

   
    public static List<Order> getAllOrders() {

        List<Order> list = new ArrayList<>();

        try {
            Connection con = DataBaseConnectivity.getConnection1();

            String query = "select * from orders ";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Order o = new Order();

                o.setOrderId(rs.getInt("order_id"));
                o.setUserName(rs.getString("user_name"));
                o.setProductId(rs.getInt("product_id"));
                o.setPrice(rs.getDouble("price"));
                o.setPaymentMode(rs.getString("payment_mode"));

                
                o.setOrderTime(rs.getTimestamp("order_time").toLocalDateTime());

                list.add(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static List<Order> getOrdersByUser(String userName) {
        List<Order> list = new ArrayList<>();

        try {
            Connection con = DataBaseConnectivity.getConnection1();
            String sql = "select * from orders where user_name=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Order o = new Order();
                o.setOrderId(rs.getInt("order_id"));
                o.setUserName(rs.getString("user_name"));
                o.setProductId(rs.getInt("product_id"));
                o.setPrice(rs.getDouble("price"));
                o.setPaymentMode(rs.getString("payment_mode"));
                o.setOrderTime(rs.getTimestamp("order_time").toLocalDateTime());

                list.add(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static boolean cancelOrder(int orderId) {

        boolean status = false;

        try (Connection con =DataBaseConnectivity.getConnection1()) {

            String sql = "delete from orders where order_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, orderId);

            int i = ps.executeUpdate();
            if (i > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }


}
