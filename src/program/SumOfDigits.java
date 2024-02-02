package program;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer to find the sum of its digits: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = sumOfDigits(number);

        // Display the sum of digits
        System.out.println("Sum of digits of " + number + " is: " + sum);

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
