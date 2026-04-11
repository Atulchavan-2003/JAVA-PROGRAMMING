package com.atul.Order;

import java.time.LocalDateTime;

public class Order {

    private int orderId;
    private String userName;
    private int productId;
    private double price;
    private String paymentMode;
    private LocalDateTime orderTime;


    public Order() {
    }

    
    public Order(String userName, int productId, double price,String paymentMode, LocalDateTime orderTime) {
        this.userName = userName;
        this.productId = productId;
        this.price = price;
        this.paymentMode = paymentMode;
        this.orderTime = orderTime;
    }

   

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
