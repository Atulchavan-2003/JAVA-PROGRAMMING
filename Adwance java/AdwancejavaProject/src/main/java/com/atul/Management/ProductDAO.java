package com.atul.Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.atul.ProductList.Product;

import Utility.DataBaseConnectivity;

public class ProductDAO {

	public static int save(Product product) {
		try {
		 Connection con = DataBaseConnectivity.getConnection1();

	        String query = "insert into product ( productName, productImage, productPrice) values (?, ?, ?)";

	        PreparedStatement pstmt = con.prepareStatement(query);

//	        pstmt.setString(1, product.getProductId());
	        pstmt.setString(1, product.getProductName());
	        pstmt.setString(2, product.getProductImage());
	        pstmt.setDouble(3, Double.parseDouble(product.getProductPrice()));


	        int row = pstmt.executeUpdate();
	        System.out.println("query success " + row);
	        if(row !=0) {
	            
	        	return row;   
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	     }

	    return 0; 
	}
	
	
	public static List<Product> getAllProducts() {
		
        List<Product> list = new ArrayList<>();

        String sql = "SELECT * FROM product";

        try (Connection con = DataBaseConnectivity.getConnection1();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("ProductId"));
                p.setProductName(rs.getString("productName"));
                p.setProductImage(rs.getString("productImage"));
                p.setProductPrice(rs.getString("productPrice"));
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

	public static int update(Product p) {
	    int status = 0;
	    try {
	        Connection con = DataBaseConnectivity.getConnection1();

	        String sql =
	          "update product set productName=?, productPrice=?, productImage=? where productId=?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, p.getProductName());
	        ps.setString(2, p.getProductPrice());
	        ps.setString(3, p.getProductImage());
	        ps.setInt(4, p.getProductId());

	        status = ps.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return status;
	}

	public static int deleteProduct(int productId) {
	   
	    try (Connection con =DataBaseConnectivity.getConnection1();
	    		
	         PreparedStatement ps =
	             con.prepareStatement("delete from product where ProductId=?")) {

	        ps.setInt(1, productId);
	       int  status = ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return 0;
	}
	
	public static Product getProductById(int productId) {

	    Product product = null;

	    try {
	        Connection con = DataBaseConnectivity.getConnection1();

	        String sql = "select * from product where productId = ?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, productId);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            product = new Product();
	            product.setProductId(rs.getInt("productId"));
	            product.setProductName(rs.getString("productName"));
	            product.setProductPrice(rs.getString("productPrice"));
	            product.setProductImage(rs.getString("productImage"));
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    	if(product!=null)
	    		System.out.println("sucsessfull getProductbyId()");
	    return product;
	}


}
