package program;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = scanner.nextInt();

        // Use a switch statement to determine the day of the week
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid number. Please enter a number between 1 and 7.";
        }

        // Print the result
        System.out.println(dayOfWeek);

        scanner.close();
    }
}
