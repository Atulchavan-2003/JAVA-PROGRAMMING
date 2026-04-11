package com.atul.Book;

import java.util.Scanner;



 class MainApp {
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

