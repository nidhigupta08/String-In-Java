package program;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            System.out.print("Enter move (Rock, Paper, Scissors). To exit the game, type \"exit\": ");
            String playerMove = scanner.nextLine();
            
            if (playerMove.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (!playerMove.equalsIgnoreCase("Rock") && !playerMove.equalsIgnoreCase("Paper") && !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }
            
            int computerIndex = random.nextInt(3);
            String computerMove = rps[computerIndex];
            
            System.out.println("Computer move: " + computerMove);
            
            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors") ||
                       playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock") ||
                       playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        scanner.close();
    }
}
