package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        DublyLink dl = new DublyLink();
	       
	        int choice, data, pos;

	        do {
	            System.out.println("\n==== DOUBLY LINKED LIST MENU ====");
	            System.out.println("1. Add at Start");
	            System.out.println("2. Add at End");
	            System.out.println("3. Add at Position");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data: ");
	                    data = sc.nextInt();
	                    dl.addBeg(data);
	                    break;

	                case 2:
	                    System.out.print("Enter data: ");
	                    data = sc.nextInt();
	                    dl.addEnd(data);
	                    break;

	                case 3:
	                    System.out.print("Enter data: ");
	                    data = sc.nextInt();
	                    System.out.print("Enter position: ");
	                    pos = sc.nextInt();
	                    dl.addPosition(data, pos);
	                    break;
	                case 6:{
	                	 dl.deleteBeg();
	                }
	                case 7:{
	                	dl.deleteEnd();
	                }
	                case 4:
	                    dl.display();
	                    break;

	                case 5:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 5);
	        
	      
	    }
	}
