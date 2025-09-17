import java.util.Scanner;

class Player {
    String name;
    int number_of_matches;
    int run;
    int wickets;

    void acceptInfo(Scanner sc) {
        System.out.print("Enter player name: ");
        this.name = sc.nextLine();
        System.out.print("Enter number of matches: ");
        this.number_of_matches = sc.nextInt();
        System.out.print("Enter runs: ");
        this.run = sc.nextInt();
        System.out.print("Enter wickets: ");
        this.wickets = sc.nextInt();
        sc.nextLine(); 
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matches: " + number_of_matches);
        System.out.println("Runs: " + run);
        System.out.println("Wickets: " + wickets + "\n");
    }
     
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            arr[i] = new Player();
            arr[i].acceptInfo(sc);
        }

        // display
        for (int i = 0; i < arr.length; i++) {
            arr[i].displayInfo();
        }

         //find maximum
        int max = arr[0].run;
	for(int i = 1;i<arr.length;i++){
	    if(arr[i].run > max){
		max = arr[i].run; 
	    }  
	}
	
	for(int i = 0;i<arr.length;i++){
	      if(max == arr[i].run)
		 arr[i].displayInfo();
	}
	
	//find maximum wickets
	 int maxw = arr[0].wickets;
	for(int i = 1;i<arr.length;i++){
	    if(arr[i].wickets > maxw){
		maxw = arr[i].wickets; 
	    }  
	}
	
	for(int i = 0;i<arr.length;i++){
	      if(maxw == arr[i].wickets)
		 arr[i].displayInfo();
	}

    }
}
