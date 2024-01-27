package program;

import java.util.Scanner;

public class GreetingProgram1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the input provided by the user
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to our program.");

        // Close the scanner to release system resources
        scanner.close();
    }
}
