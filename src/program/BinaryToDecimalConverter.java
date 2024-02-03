package program;

import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        // Convert the binary number to decimal
        int decimal = binaryToDecimal(binary);

        // Display the decimal equivalent
        System.out.println("Decimal equivalent of " + binary + " is: " + decimal);

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to convert a binary number to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
