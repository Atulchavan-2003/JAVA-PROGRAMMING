class Product {
    int pid;
    String pname;
    double costPrice;
    int quantity;
   static double discount;
       static {
           discount = 15;
	}
    // Default constructor
    Product() {
        this.pid = 103;
        this.pname = "pen";
        this.costPrice = 5;
        this.quantity = 5;
    }

    // Parameterized constructor
    Product(int pid, String pname, double costPrice, int quantity) {
        this.pid = pid;
        this.pname = pname;
        this.costPrice = costPrice;
        this.quantity = quantity;
    }

    // Setters
    void setPid(int pid) {
        this.pid = pid;
    }

    void setPname(String pname) {
        this.pname = pname;
    }

    void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    void setDiscount(double d){
    	discount = d;
    }
    // Getters
    int getPid() {
        return this.pid;
    }

    String getPname() {
        return this.pname;
    }

    double getCostPrice() {
        return this.costPrice;
    }

    int getQuantity() {
        return this.quantity;
    }
    double getDicount(){
    	return discount;
    }
    double applyDiscount(){
	return this.costPrice/100*discount;
    }
    double calculateSellprice(){
	return this.quantity * this.costPrice; 	
    }

    // Display product details
    void display() {
        System.out.println("Product ID      : " + this.pid);
        System.out.println("Product Name    : " + this.pname);
        System.out.println("Cost Price      : " + this.costPrice);
        System.out.println("Quantity        : " + this.quantity);
	System.out.println("Discount :"+ applyDiscount()*this.quantity+"\n");
	System.out.println("Calculateselling price :"+calculateSellprice ()+"\n");
	}
}

// Test class
class Test {
    public static void main(String[] args) {
        // Using default constructor
        Product p1 = new Product();
        p1.display();

        // Using parameterized constructor
        Product p2 = new Product(101, "Laptop", 45000.0, 5);
        p2.display();
       
        Product p3 = new Product(102,"phone",20000,5);
	p3.display();
    }
}
