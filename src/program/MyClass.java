package program;

public class MyClass {
    private int myNumber;

    // Constructor
    public MyClass(int myNumber) {
        // Use "this" to differentiate between instance variable and constructor parameter
        this.myNumber = myNumber;
    }

    // Method using "this" to access instance variable
    public void printNumber() {
        System.out.println("My number is: " + this.myNumber);
    }

    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObject = new MyClass(42);

        // Call the method to print the number
        myObject.printNumber();
    }
}
