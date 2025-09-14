import java.util.Scanner;
class PlaceStudent {
    String companyName;
    double distance;
    String designation;

    // Default constructor
    PlaceStudent() {
        this.companyName = "atuk";
        this.distance = 12;
        this.designation = "pune";
    }

    // Parameterized constructor
    PlaceStudent(String c, double d, String des) {
        this.companyName = c;
        this.distance = d;
        this.designation = des;
    }

    // Setters
    void setCompanyName(String c) {
        this.companyName = c;
    }
    void setDistance(double d) {
        this.distance = d;
    }
    void setDesignation(String des) {
        this.designation = des;
    }

    // Getters
    String getCompanyName() {
        return companyName;
    }
    double getDistance() {
        return distance;
    }
    String getDesignation() {
        return designation;
    }

    // Display Method
    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Distance: " + distance);
        System.out.println("Designation: " + designation);
    }
} // PlaceStudent class end here

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter company name: ");
        String cname = sc.nextLine();

        System.out.print("Enter distance (km): ");
        double dist = sc.nextDouble();
        sc.nextLine(); // buffer clear

        System.out.print("Enter designation: ");
        String desig = sc.nextLine();

        // Using parameterized constructor
        PlaceStudent c1 = new PlaceStudent(cname, dist, desig);

        // Display object
        System.out.println(" Placement Info ");
        c1.display();

        
        System.out.println("Getter check:");
        System.out.println("Company : " + c1.getCompanyName());
        System.out.println("Distance: " + c1.getDistance());
        System.out.println("Designation: " + c1.getDesignation());
          
    }
}
