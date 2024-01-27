package program;
import java.util.Scanner;
public class GreetingProgram {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the input provided by the user
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        
        // Read the input provided by the user
        int age = scanner.nextInt();
        
        // Clear the scanner's buffer
        scanner.nextLine();

        // Greet the user with a personalized message based on their age
        System.out.println("Hello, " + name + "!");

        if (age <= 0) {
            System.out.println("That's an invalid age!");
        } else if (age < 18) {
            System.out.println("You're still young, " + name + "! Enjoy your youth!");
        } else if (age < 30) {
            System.out.println("Ah, " + age + " is a great age to explore and learn new things!");
        } else if (age < 60) {
            System.out.println("Welcome, seasoned adventurer! You're " + age + " years young!");
        } else {
            System.out.println("Wow, " + age + " years old! You're an inspiration to us all!");
        }

        // Close the scanner to release system resources
        scanner.close();
    }
}
