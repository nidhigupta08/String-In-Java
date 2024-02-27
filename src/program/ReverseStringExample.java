package program;

import java.util.Scanner;

public class ReverseStringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        // Iterate through the string from end to start and append each character to the StringBuilder
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}
