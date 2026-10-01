package com.atul.ProductList;

public class Product {
	 
	 String productName;
	 String image ;
	 String price;
	 
	 public Product( String productName,String image,String price) {
		super();
		this.image = image;
		this.productName = productName;
		this.price = price;
	}
	 public String getImage() {
		 return image;
	 }
	 public void setImage(String image) {
		 this.image = image;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
	 }
	 public String getPrice() {
		 return price;
	 }
	 public void setPrice(String price) {
		 this.price = price;
	 }
	 
}
