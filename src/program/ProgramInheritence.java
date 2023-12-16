package program;

class Vehicle1 {
    protected String brand;

    public Vehicle1(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car2 extends Vehicle1 {
    private String model;

    public Car2(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        display(); // Inherited method from Vehicle class
        System.out.println("Model: " + model);
    }
}

public class ProgramInheritence {
	 public static void main(String[] args) {
	        Car2 myCar = new Car2("Toyota", "Corolla");
	        myCar.displayDetails();
	    }
}
