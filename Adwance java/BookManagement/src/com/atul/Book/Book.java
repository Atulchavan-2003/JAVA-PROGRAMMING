package com.atul.Book;

class Book{
	
    int bookId;
    String bookName;
    String authorName;
    String category;
    float rating;
    double price;
  
	
	
	Book() {
		this.bookId = 0;
		this.bookName = "Not Given";
		this.authorName = "Not Given";
		this.category = "Not Given";
		this.rating = 0;
		this.price = 0;
	}

	Book(int bookId, String name, String author, String category, float rating, double price) {
		
		this.bookId = bookId;
		this.bookName = name;
		this.authorName = author;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}

	int getBookId() {
		return bookId;
	}

	void setBookId(int bookId) {
		this.bookId = bookId;
	}

	String getBookName() {
		return bookName;
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getAuthorName() {
		return authorName;
	}

	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	String getCategory() {
		return category;
	}

	void setCategory(String category) {
		this.category = category;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	float getRating() {
		return rating;
	}

	void setRating(float rating) {
		this.rating = rating;
	}
	void display() {
		 System.out.println("ID: " + this.bookId);
	     System.out.println("Name: " + this.bookName);
	     System.out.println("Author: " + this.authorName);
	     System.out.println("Category: " + this.category);
	     System.out.println("Price: " + this.price);
       System.out.println("Rating: " + this.rating);
	}
	
    
}
