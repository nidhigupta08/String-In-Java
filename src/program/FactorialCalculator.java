package program;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        
        // Read the input provided by the user
        int n = scanner.nextInt();
        
        // Clear the scanner's buffer
        scanner.nextLine();

        // Calculate the factorial of the input number
        long factorial = calculateFactorial(n);
        
        // Display the factorial
        System.out.println("The factorial of " + n + " is: " + factorial);

        // Close the scanner to release system resources
        scanner.close();
    }
    
    // Method to calculate the factorial of a given number
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
