package program;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int numQuestions = 5; // Adjust for desired number of questions

        for (int i = 0; i < numQuestions; i++) {
            int num1 = random.nextInt(100) + 1; // Generate random numbers between 1 and 100
            int num2 = random.nextInt(100) + 1;
            char operator = generateRandomOperator(); // Get random operator

            int answer = askQuestion(scanner, num1, num2, operator);
            int correctAnswer = calculateAnswer(num1, num2, operator);

            if (answer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer is " + correctAnswer);
            }
        }

        System.out.println("Your score: " + score + " out of " + numQuestions);
        scanner.close();
    }

    public static char generateRandomOperator() {
        int randomInt = new Random().nextInt(4);
        switch (randomInt) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/'; // Handle division by zero in calculateAnswer
            default:
                return '+'; // Default to addition if random selection fails
        }
    }

    public static int askQuestion(Scanner scanner, int num1, int num2, char operator) {
        System.out.print("What is " + num1 + " " + operator + " " + num2 + "? ");
        return scanner.nextInt();
    }

    public static int calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) { // Handle division by zero
                    System.out.println("Error: Cannot divide by zero. Assigning 0 to the answer.");
                    return 0;
                } else {
                    return num1 / num2;
                }
            default:
                return 0; // Should not reach here, but added for safety
        }
    }
}