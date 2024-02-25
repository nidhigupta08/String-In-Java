package program;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance
        System.out.print("Enter the distance: ");
        double distance = scanner.nextDouble();

        // Prompt the user to choose conversion direction
        System.out.println("Choose conversion direction:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        int choice = scanner.nextInt();

        // Perform the conversion based on user's choice
        double result = 0;
        switch (choice) {
            case 1:
                result = kilometersToMiles(distance);
                System.out.println(distance + " kilometers is equal to " + result + " miles.");
                break;
            case 2:
                result = milesToKilometers(distance);
                System.out.println(distance + " miles is equal to " + result + " kilometers.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Method to convert miles to kilometers
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
