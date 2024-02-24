package program;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the range
        System.out.print("Enter the minimum value of the range: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = scanner.nextInt();

        // Prompt the user to enter the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();

        // Generate and print random numbers
        System.out.println("Random numbers between " + min + " and " + max + ":");
        for (int i = 0; i < count; i++) {
            int randomNumber = generateRandomNumber(min, max);
            System.out.println(randomNumber);
        }

        scanner.close();
    }

    // Method to generate random number within a range
    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
