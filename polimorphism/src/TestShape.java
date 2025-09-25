
import java.util.Scanner;

//  Base Class
 abstract class Shape2 {
    double area;   

    // Constructor
    Shape2() {
        this.area = 0.0;
    }
    // parameter constructor
    Shape2 (double a){
    	this.area = a;
    }
    // Setter
    void setArea(double area) {
        this.area = area;
    }

    // Getter
    double getArea() {
        return this.area;
    }

  
    abstract void calculateArea();
     void display() {
    	 System.out.println("display :");
     }
}

//  Derived Class - Triangle
class Triangle2 extends Shape2 {
        double base;
        double height;

    // Constructor
    Triangle2(double base, double height, double area ){
        super(area);
    	this.base = base;
        this.height = height;
    }

    // Setters
    void setBase(double base) { 
    	this.base = base;
    }
    void setHeight(double height) { 
    	this.height = height; 
    }

    // Getters
    double getBase() { 
    	return base;
    }
    double getHeight() {
    	return height;
    }

    void calculateArea() {
        area = (base * height) / 2;
    }

   
    void display() {
        System.out.println("Shape: Triangle");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
}

//  Derived Class Circle
class Circle2 extends Shape2 {
       double radius;

    // Constructor
    Circle2(double radius,double area) {
    	super(area);
        this.radius = radius;
    }

    // Setter
    void setRadius(double radius) { 
    	this.radius = radius;
    }

    // Getter
    double getRadius() { 
    	return radius;
    }

    
    
    void calculateArea() {
    	area = 3.14 * (getRadius()* getRadius());
    }

    
    void display() {
    	super.display();
        System.out.println("Shape: Circle");
        System.out.println("Area: " + area);
        System.out.println("Radius: " + radius);
      
    }
}

 //Derived Class Rectangle
class Rectangle2 extends Shape2 {
            double length;
            double width;

    // Constructor
    Rectangle2(double length, double width, double area) {
       super(area);
    	this.length = length;
        this.width = width;
    }

    // Setters
    void setLength(double length) {
    	this.length = length;
    }
    void setWidth(double width) { 
    	this.width = width;
    }

    // Getters
    double getLength() {
    	return length;
    }
    double getWidth() { 
    	return width; 
    }

    
    void calculateArea() {
        area = length * width;
    }

    
    void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        
    }
}

//  Test Class
class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Triangle
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        Shape2 s1;
        
        s1 = new Triangle2(base, height, 5); 
        s1.calculateArea();
        s1.display();

        // Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        s1 = new Circle2(radius,5); 
        s1.calculateArea();
        s1.display();

        // Rectangle
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        
        s1 = new Rectangle2(length, width,5);  
        s1.calculateArea();
        s1.display();

     
    }
}


