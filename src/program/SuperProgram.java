package program;

class Vehicle4 {
    private String brand;
    private int year;

    public Vehicle4(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
//Subclass inheriting from Vehicle
class Car4 extends Vehicle4 {
 private int numOfDoors;

 public Car4(String brand, int year, int numOfDoors) {
     super(brand, year); // Calling the superclass constructor
     this.numOfDoors = numOfDoors;
 }

 // Additional method specific to Car
 public void displayDetails() {
     super.display(); // Calling the superclass method
     System.out.println("Number of doors: " + numOfDoors);
 }
}
public class SuperProgram {
	 public static void main(String[] args) {
	        // Creating an object of the subclass
	        Car4 myCar = new Car4("Toyota", 2022, 4);
	        
	        // Using methods from both superclass and subclass
	        myCar.display(); // Calling the method from the superclass
	        myCar.displayDetails(); // Calling the method from the subclass
	    }
}
