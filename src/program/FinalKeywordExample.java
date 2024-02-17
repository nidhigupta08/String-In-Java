package program;

public class FinalKeywordExample {

    // Constant variable declaration using final keyword
    public static final double PI = 3.14159;

    // Method with final parameter
    public static void display(final String message) {
        System.out.println("Message: " + message);
        // Trying to modify the final parameter 'message' will result in a compilation error
        // message = "Modified message"; // Uncommenting this line will cause a compilation error
    }

    public static void main(String[] args) {
        // Local variable declaration using final keyword
        final int x = 10;
        // Trying to change the value of 'x' will result in a compilation error
        // x = 20; // Uncommenting this line will cause a compilation error

        System.out.println("Value of PI: " + PI);
        System.out.println("Value of x: " + x);

        // Calling method display with a final argument
        display("Hello, World!");
    }
}
