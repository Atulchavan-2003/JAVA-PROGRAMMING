// Base class
class Vehicle {
    String brand;
    int speed;
    
    Vehicle(){
    	this.brand = "not given";
    	this.speed = 0;
    }
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    
    String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    void run() {
        System.out.println("Vehicle is running...");
    }
}

// Derived class Car
class Car extends Vehicle {
    int doors;
    
    Car(String brand, int speed, int doors) {
        super(brand, speed);   
        this.doors = doors;
    }
     
    
    int getDoors() {
		return doors;
	}


	void setDoors(int doors) {
		this.doors = doors;
	}


	void display() {
        super.display();  
        System.out.println("Doors: " + doors);
    }

    
    void run() {
        System.out.println("Car is running smoothly");
    }
}

// Derived class Bike
class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

   
    boolean isHasGear() {
		return hasGear;
	}


	void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}


	void display() {
        super.display();
        System.out.println("Has Gear: " + hasGear);
    }

  
    void run() {
        System.out.println("Bike is zooming fast");
    }
}

// Derived class Truck
class Truck extends Vehicle {
    int capacity;

    Truck(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }
    
  
    int getCapacity() {
		return capacity;
	}


	void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	void display() {
        super.display();
        System.out.println("Capacity: " + capacity);
    }

    
    void run() {
        System.out.println("Truck is carrying heavy load...");
    }
}

// Test class
public class TestVehicle {
    public static void main(String[] args) {
    	Vehicle v1 = new Vehicle();
    	
    
    	v1 = new Car("Honda", 120, 4);
        v1.display();
        v1.run();

        System.out.println();
        v1 = new Bike("Yamaha", 90,true);
        v1.display();
        v1.run();

        System.out.println();
        v1 = new Truck("Tata", 60, 20);
        v1.display();
        v1.run();
    }
}
