package program;
import java.util.Scanner;

public class WordFinder {
	public static void main(String[] args) {
        // Define an array of words
        String[] words = { "apple", "banana", "orange", "grape", "melon", "peach" };

        // Prompt the user to enter a word to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.nextLine();

        // Call the findWord method to search for the word
        boolean found = findWord(words, searchWord);

        // Display the result
        if (found) {
            System.out.println(searchWord + " is found in the array.");
        } else {
            System.out.println(searchWord + " is not found in the array.");
        }

        scanner.close();
    }

    // Method to find a word in the array
    public static boolean findWord(String[] words, String searchWord) {
        // Iterate through the array
        for (String word : words) {
            // Compare each word with the search word
            if (word.equalsIgnoreCase(searchWord)) {
                return true; // Return true if the word is found
            }
        }
        return false; // Return false if the word is not found
    }
}
