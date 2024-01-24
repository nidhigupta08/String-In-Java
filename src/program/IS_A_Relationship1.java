package program;

class Vehicle3 {
    String brand;

    public Vehicle3(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " is starting");
    }

    public void stop() {
        System.out.println(brand + " is stopping");
    }
}
class Carr extends Vehicle3 {
    int numberOfDoors;

    public Carr(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }
    public void drive() {
        System.out.println(brand + " with " + numberOfDoors + " doors is driving");
    }
}

public class IS_A_Relationship1 {
    public static void main(String[] args) {
        Carr myCar = new Carr("Toyota", 4);

        myCar.start();      // Inherited from Vehicle
        myCar.drive();      // Specific to Car
        myCar.stop();       // Inherited from Vehicle
    }
}