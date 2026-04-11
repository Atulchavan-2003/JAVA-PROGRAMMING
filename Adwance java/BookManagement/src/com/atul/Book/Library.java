package com.atul.Book;

import java.util.Scanner;

class Library{
	 int size=50;
	  int counter = 0;
	  Book[] bookArr = new Book[size];
	      
	  
	  	Library() {
	        hardcodedBooks();
	    }
	   void addOneBook(){ 
		  if(this.size<=counter) {
			  
		  }
	   } 
	  	
	   void hardcodedBooks() {
		   bookArr[counter++] = new Book(101, "Atomic Habits", "James Clear", "Self-Help", 2.1f,200);
		   bookArr[counter++] = new Book(102, "Clean Code", "Robert Martin", "Programming", 4.8f,550);
		   bookArr[counter++] = new Book(103, "Effective Java", "Joshua Bloch", "Programming", 4.7f,650);
		   bookArr[counter++] = new Book(104, "The Pragmatic Programmer", "Andrew Hunt", "Programming",4.5f, 500);
		   bookArr[counter++] = new Book(105, "Database System Concepts", "Abraham Silberschatz", "Database",4.4f, 900);
		   bookArr[counter++] = new Book(106, "Operating System Concepts", "Galvin", "Operating System", 4.3f,850);
		   bookArr[counter++] = new Book(107, "Design Patterns", "Erich Gamma", "Software Engineering", 4.6f,750);
		   bookArr[counter++] = new Book(108, "Computer Networks", "Andrew Tanenbaum", "Networking",4.5f, 800);
		   bookArr[counter++] = new Book(109, "C Programming Language", "Dennis Ritchie", "Programming", 4.2f,450);
		   bookArr[counter++] = new Book(110, "Algorithms", "CLRS", "Algorithms", 4.9f,950);

	    } 
	   void displayBooks() {
	        for (int i = 0; i < counter; i++) {
	            bookArr[i].display();
	        }
	    }
	   void addBook(Scanner sc ) {
	        if (counter < bookArr.length) {
	           

	            System.out.print("Enter Book ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Book Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Author Name: ");
	            String author = sc.nextLine();

	            System.out.print("Enter Category: ");
	            String category = sc.nextLine();

	            System.out.print("Enter Price: ");
	            double price = sc.nextDouble();
	            
	            System.out.print("Enter Rating: ");
	            float rating = sc.nextFloat();

	            bookArr[counter++] = new Book(id, name, author, category,rating,price);
	            System.out.println(" Book added successfully!\n");
	        } else {
	            System.out.println(" Library is full! Cannot add more books.");
	        }
	    }

	   void removeBook(int bId){
		   boolean flag = false;
		   for(int i = 0;i< counter;i++) {
		       if(bookArr[i].bookId == bId){
		    	    for(int j = i;j< counter-1;j++) {  
		    	    	bookArr[j]=bookArr[j+1];
		    	    }
		    	    flag = true;
		    	    break;
		       }
		   }
		    if(flag == true) {
		       counter--;
		       System.out.println("Book remove successfully!");
		    }
		    else {
		    	System.out.println("Book Id not found!");
		    }
	   }
	   void searchBook(Scanner sc ) {
		   boolean flag = false;
		   int index=0,bId;
		   
		   System.out.println("Enter the book id");
		   bId = sc.nextInt();
		   sc.nextLine();

		   for(int i= 0;i<counter;i++) {
			   if(bookArr[i].bookId == bId  ) {
				    flag = true;
				    index = i;
				    break;
			   }
		   }
		   if(flag == true) {
			    bookArr[index].display();
		   }
		   else {
			   System.out.println("not found");
		   }
	   }
	   void upgradeBook(int bId, Scanner sc) {
		    boolean found = false;

		    for (int i = 0; i < counter; i++) {
		        if (bookArr[i].bookId == bId) {
		            found = true;

		            System.out.println("1. Book Name");
		            System.out.println("2. Author Name");
		            System.out.println("3. Category");
		            System.out.println("4. Price");
		            System.out.println("5. Rating");
		            System.out.println("6. Book ID");

		            int choice = sc.nextInt();
		            sc.nextLine();

		            switch (choice) {
		                case 1:
		                    bookArr[i].setBookName(sc.nextLine());
		                    break;
		                case 2:
		                    bookArr[i].setAuthorName(sc.nextLine());
		                    break;
		                case 3:
		                    bookArr[i].setCategory(sc.nextLine());
		                    break;
		                case 4:
		                    bookArr[i].setPrice(sc.nextDouble());
		                    break;
		                case 5:
		                    bookArr[i].setRating(sc.nextFloat());
		                    break;
		                case 6:
		                    bookArr[i].setBookId(sc.nextInt());
		                    break;
		                default:
		                    System.out.println("Invalid choice");
		                    return;
		            }

		            System.out.println("Book updated successfully!");
		            return;
		        }
		    }

		    if (!found) {
		        System.out.println("Book ID not found!");
		    }
		}

	   void showCategory(Scanner sc){
		   boolean flag = false;
		     System.out.println("enter the category");
		     String cat=sc.nextLine();
		     for(int i = 0;i<counter;i++) {
		    	 if (bookArr[i].category.equals(cat)) {
		    		  bookArr[i].display();
		    		  flag=true;
		    	 }	
		     }
		     if(flag == false){
	    		 System.out.println("category is not found");
		     }
	   
	  
			   
		   
		   if(flag == true) {
			   System.out.println("book update successfully! ");
		   } 
		   else {
			   System.out.println("Book id not found ");
		   }
	   }
	   
}
