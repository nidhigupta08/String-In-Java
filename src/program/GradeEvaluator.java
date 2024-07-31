package program;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a grade
        System.out.print("Enter a grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);

        // Use switch statement to evaluate the grade
        String description;
        switch (grade) {
            case 'A':
                description = "Excellent";
                break;
            case 'B':
                description = "Good";
                break;
            case 'C':
                description = "Average";
                break;
            case 'D':
                description = "Below Average";
                break;
            case 'F':
                description = "Fail";
                break;
            default:
                description = "Invalid grade. Please enter A, B, C, D, or F.";
        }

        // Print the result
        System.out.println(description);
        scanner.close();
    }
}
