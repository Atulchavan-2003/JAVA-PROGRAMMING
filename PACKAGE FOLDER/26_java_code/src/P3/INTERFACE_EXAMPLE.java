package P3;

interface Product {
    void sell();
    void buy();
}

interface Traveller {
    void travel();
}

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle implements Traveller, Product {
	
    public void travel() {
        System.out.println("Car is moving...");
    }
    
    public void sell() {
        System.out.println("Car sold!");
    }
    
    public void buy() {
        System.out.println("Car bought");
    }
}


class Animal {
    void eat() {
        System.out.println("Animal eat ");
    }
}


public class INTERFACE_EXAMPLE {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.travel();
        c.buy();
        c.sell();
    }
}
