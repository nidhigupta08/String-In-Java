package program;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count the number of words in the sentence
        int wordCount = countWords(sentence);

        // Display the result
        System.out.println("Number of words in the sentence: " + wordCount);

        // Close the scanner to release system resources
        scanner.close();
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Remove leading and trailing spaces
        sentence = sentence.trim();

        // If the sentence is empty, return 0
        if (sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words using one or more spaces as delimiter
        String[] words = sentence.split("\\s+");

        // Return the number of words
        return words.length;
    }
}

