package program;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Let's play Rock, Paper, Scissors!");

        System.out.print("Enter your choice (R/P/S): ");
        String userChoice = scanner.nextLine().toUpperCase();

        int computerChoiceIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("R") && computerChoice.equals("S")) ||
                   (userChoice.equals("P") && computerChoice.equals("R")) ||
                   (userChoice.equals("S") && computerChoice.equals("P"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}