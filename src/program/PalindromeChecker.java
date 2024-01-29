package program;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        
        // Read the input provided by the user
        String str = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        
        // Display the result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        // Close the scanner to release system resources
        scanner.close();
    }
    
    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

