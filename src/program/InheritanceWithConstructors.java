package program;

public class InheritanceWithConstructors {

	public static void main(String[] args) {
        Car myCar = new Car("Car", "Toyota");
        myCar.displayType();  // Inherited method from Vehicle class
        myCar.displayBrand(); // Car-specific method
    }
}
	class Vehicle {
	    private String type;

	    public Vehicle(String type) {
	        this.type = type;
	    }

	    public void displayType() {
	        System.out.println("Type of Vehicle: " + type);
	    }
	}

	class Car extends Vehicle {
	    private String brand;

	    public Car(String type, String brand) {
	        super(type); // Calling the constructor of the superclass (Vehicle)
	        this.brand = brand;
	    }

	    public void displayBrand() {
	        System.out.println("Brand of Car: " + brand);
	    }

	}	    


