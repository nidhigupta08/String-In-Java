package program;

public class FinalExample {
    public static void main(String[] args) {
        final int x = 10; // Declaring and initializing a final variable
        // x = 20; // Trying to change the value of x will result in a compilation error
        
        final double PI = 3.14; // Another final variable
        
        System.out.println("Value of x: " + x);
        System.out.println("Value of PI: " + PI);
        
        // final variables can be used in calculations and printing
        double area = PI * x * x;
        System.out.println("Area of the circle: " + area);
        
        final String message = "Hello, World!"; // Declaring and initializing a final string
        
        System.out.println(message);
        
        // Trying to modify a final reference variable (message) will result in a compilation error
        // message = "Goodbye, World!";
    }
}
