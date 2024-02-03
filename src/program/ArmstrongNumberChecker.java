package program;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        boolean isArmstrong = checkArmstrong(number);

        // Display the result
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean checkArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Find the number of digits
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // Calculate the sum of nth power of individual digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the number is Armstrong or not
        return result == number;
    }
}
