package program;

import java.util.Scanner;

public class SimpleTextBasedGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100

        System.out.println("Guess a number between 1 and 100!");

        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("You guessed it! The number was " + targetNumber);
            }
        } while (guess != targetNumber);

        scanner.close();
    }
}
