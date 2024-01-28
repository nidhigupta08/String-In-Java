package program;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's prime: ");
        
        // Read the input provided by the user
        int number = scanner.nextInt();
        
        // Clear the scanner's buffer
        scanner.nextLine();

        // Check if the number is prime
        boolean isPrime = checkPrime(number);
        
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to release system resources
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
