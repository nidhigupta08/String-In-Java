package program;

import java.util.Scanner;

public class NumberReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number (shifting digits)
            number /= 10; // Remove the last digit from original number
        }
        return reversed;
    }
}
