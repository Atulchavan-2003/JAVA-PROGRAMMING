import java.util.Scanner;
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
	   }
	   void upgradeBook(int bId , Scanner sc){
		   boolean flag = false;
		   for(int i = 0;i<counter;i++) {
			   if(bookArr[i].bookId == bId){
				   flag = true;
				    System.out.println("Book found!");
		            System.out.println("What do you want to update?");
		            System.out.println("1. Book Name");
		            System.out.println("2. Author Name");
		            System.out.println("3. Category");
		            System.out.println("4. Price");
		            System.out.println("5. Rating");
		            System.out.println("6. Book ID");
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();
		             sc.nextLine();
		            if(choice == 1) {
		            	    System.out.print("Enter new Book Name: ");
		                    String newName = sc.nextLine();
		                    bookArr[i].setBookName(newName);
		                    break;
		            }
		            else if(choice == 2) {
		            	   System.out.print("Enter new author Name: ");
		                    String newAuthor = sc.nextLine();
		                    bookArr[i].setAuthorName(newAuthor);
		                    break;
		            }
		            else if(choice == 3) {
		            	System.out.print("Enter new Category: ");
		                String newCategory = sc.nextLine();
		                bookArr[i].setCategory(newCategory);
		                break;
		            }
		            else if(choice == 4) {
		            	 System.out.print("Enter new Price: ");
		                 double newPrice = sc.nextDouble();
		                 bookArr[i].setPrice(newPrice);
		                 break;
		            }
		            else if(choice == 5) {
		            	 System.out.print("Enter new Rating: ");
		                 float newRating = sc.nextFloat();
		                 bookArr[i].setRating(newRating);
		                 break;
		            }
		            else if(choice == 6) {
		            	System.out.print("Enter new Book ID: ");
		                int newId = sc.nextInt();
		                bookArr[i].setBookId(newId);
		                break;
		            }
		            else 
		            {
		            	  System.out.println("Invalid choice!");
		            }
		            
			   }
			   
		   }
		   if(flag == true) {
			   System.out.println("book update successfully! ");
		   } 
		   else {
			   System.out.println("Book id not found ");
		   }
	   }
	   
}

 class Testbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library l1 = new Library();
        String exit;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display All Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Remove a Book");
            System.out.println("4. Upgrade a Book");
            System.out.println("5. Search Book by ID");
            System.out.println("6. Show Books by Category");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if(choice == 1) {
                l1.displayBooks();
            }
            else if(choice == 2) {
                l1.addBook(sc);
            }
            else if(choice == 3) {
                System.out.print("Enter Book ID to remove: ");
                int removeId = sc.nextInt();
                l1.removeBook(removeId);
            }
            else if(choice == 4) {
                System.out.print("Enter Book ID to upgrade: ");
                int upgradeId = sc.nextInt();
                sc.nextLine(); 
                l1.upgradeBook(upgradeId, sc);
            }
            else if(choice == 5) {
                l1.searchBook(sc);
            }
            else if(choice == 6) {
                l1.showCategory(sc);
            }
            else {
                System.out.println("Invalid choice! Try again.");
            }

            System.out.print("\nDo you want to exit? (y/n): ");
            exit = sc.nextLine();

        } while(!exit.equalsIgnoreCase("y"));


        System.out.println("Exiting program. Thank you!");
  
    }
}
