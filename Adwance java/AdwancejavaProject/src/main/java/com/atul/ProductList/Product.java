package com.atul.ProductList;

public class Product {
	 
	int ProductId;
	 String productName;
	 String productImage ;
	 String productPrice;
	 
	 public Product( String productName,String image, String price) {
		super();
		
		this.productName = productName;
		this.productPrice = price;
		this.productImage = image;
	}
	 
	 public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public	int getProductId() {
		return ProductId;
	}
	 public void setProductId(int i) {
		 ProductId = i;
	 }
	 public String getProductImage() {
		 return productImage;
	 }
	 public void setProductImage(String image) {
		 this.productImage = image;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
	 }
	 public String getProductPrice() {
		 return productPrice;
	 }
	 public void setProductPrice(String price) {
		 this.productPrice = price;
	 }
	
	 
}
