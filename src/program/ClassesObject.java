package program;

public class ClassesObject {
    
    class Car {
        String brand;
        String model;
        int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    public static void main(String[] args) {
        ClassesObject outerObj = new ClassesObject();
        Car myCar = outerObj.new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
    }
}
