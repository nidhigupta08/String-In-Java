package program;

public class ArithmeticOperations {

    public static void main(String[] args) {

        int x = 5;

        int result = x++ + ++x * 2 + x-- - --x;
        System.out.println("Original Result: " + result);

        // Make some changes or perform additional operations
        x += 3; // Add 3 to x
        result = x * 2; // Double the value of x
        System.out.println("Modified Result: " + result);
    }
}
