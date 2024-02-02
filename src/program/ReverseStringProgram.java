package program;

import java.util.Scanner;

public class ReverseStringProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

