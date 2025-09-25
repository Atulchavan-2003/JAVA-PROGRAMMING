class Shirt {
 
    int sid;
    String brand;
    String type;
    double price;   
    String size;    

    static double medium = 0.10;
    static double large = 0.20;
    static double xlarge = 0.30;
    
    Shirt() {
        this.sid = 5;
        this.brand = "puma";
        this.type = "Casual";
        this.price = 1000;
        this.size = "large";
    }

  
    Shirt(int sid, String brand, String type, double price, String size) {
        this.sid = sid;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    // Setters
    void setSid(int sid) {
        this.sid = sid;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setType(String type) {
        this.type = type;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setSize(String size) {
        this.size = size;
    }

    // Getters
    int getSid() {
        return this.sid;
    }

    String getBrand() {
        return this.brand;
    }

    String getType() {
        return this.type;
    }

    double getPrice() {
        return this.price;
    }

    String getSize() {
        return this.size;
    }

    double calculateFinalPrice() {
        if(this.size.equals("small")){
	    return this.price;
	}
	else if(this.size == "medium"){
	   return this.price+this.price * medium;
	}
	else if(this.size == "large"){
	 return this.price+this.price*large;
	}
	else{
	 return this.price + this.price*xlarge;
	}

    }	

    // Display method
    void display() {
        System.out.println("Shirt ID    : " + this.sid);
        System.out.println("Brand       : " + this.brand);
        System.out.println("Type        : " + this.type);
        System.out.println("Base Price  : " + this.price);
        System.out.println("Size        : " + this.size);
        System.out.println("final calculater :"+calculateFinalPrice()+"\n\n");
     
    }
}

// Test class
class TestShirt {
    public static void main(String[] args) {
        // Using default constructor
        Shirt s1 = new Shirt();
        s1.display();

        // Using parameterized constructor
        Shirt s2 = new Shirt(101, "Peter England", "Formal", 1000, "xlarge");
        s2.display();

        // Another example
        Shirt s4 = new Shirt(103, "Allen Solly", "Formal", 2000, "large");
        s4.display();
    }
}
