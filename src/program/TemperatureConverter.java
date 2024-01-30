package program;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Prompt the user to enter the unit of the temperature
        System.out.print("Enter the unit (Celsius or Fahrenheit): ");
        scanner.nextLine(); // Consume the newline character
        String unit = scanner.nextLine();

        // Convert the temperature to the other unit
        double convertedTemperature;
        if (unit.equalsIgnoreCase("Celsius")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else if (unit.equalsIgnoreCase("Fahrenheit")) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid unit entered. Please enter either Celsius or Fahrenheit.");
        }

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
