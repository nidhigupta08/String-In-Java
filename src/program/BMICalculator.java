package program;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user to enter height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display the BMI
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        // Close the Scanner
        scanner.close();
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // BMI formula: weight / (height * height)
        return weight / (height * height);
    }
}
