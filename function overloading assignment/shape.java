import java.util.Scanner;

class Shape {
 								
        void calculateArea(Triangle t){
		double area;
		area = (t.getBase()* t.getHeight())/2;
		System.out.println("area of Triangle is :"+ area);
	}

	void calculateArea(Circle c){
               double area;
		area = 3.14 * (c.getRadius()*c.getRadius());
		System.out.println("area of Radius is :"+ area);
	}

	void calculateArea(Rectangle r){
             double area;
             area = r.getLength()*r.getBreadth();
	     System.out.println("area of Rectangle is :"+ area);
	}


}
class Triangle {

        double base;
	double height;
	Triangle(double base, double height){
	    this.base= base;
	    this.height= height;
	}

	//setters
	void setBase(double b){
	     this.base = b;
	}

	void setHeight(double h){
	     this.height = h;
	}

        //getters
        double getBase(){
	    return this.base;
	}

	double getHeight(){
	    return this.height;
	}

	void display(){
	     System.out.println("Base :"+ this.base);
	     System.out.println("Base :"+ this.height);
	}
	
}
class Circle{
	double radius;
	Circle (){
	     this.radius=3;		
	}
	Circle (double r){
	     this.radius=r;		
	}

         //setters 
	void setRadius(double r){
		this.radius=r;
	}
	double getRadius(){
	    return this.radius;
	}
	void display(){
	     System.out.println("Radius :"+this.radius);
	}
}
class Rectangle{

	double length,breadth;
	Rectangle(){
	     this.length = 1;
	     this.breadth =1;
	}
	Rectangle(double l,double b){
	     this.length = l;
	     this.breadth =b;
	}
	void setLength(double l){
	     this.length = l;
	}
	void setBreadth(double b){
	     this.breadth = b;
	}
	double getLength(){
	    return this.length;
	}
	double getBreadth(){
	      return this.breadth;
	}
        void display(){
	     System.out.println("Length :"+this.length);
	     System.out.println("breadth:"+this.breadth);
	}

        

}

class TestShape {
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        Shape s1 = new Shape();

        // Triangle
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();

        Triangle t1 = new Triangle(base, height);

        t1.display();
        s1.calculateArea(t1);	

	 // Circle
	System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        c1.display();
        s1.calculateArea(c1);
	
	     // Rectangle
        System.out.print("Enter length of Rectangle: ");

        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle r1 = new Rectangle(length, breadth);
        r1.display();
        s1.calculateArea(r1);
	
    }
}
