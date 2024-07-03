package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        // Path to your text file
        String filePath = "sample.txt";

        // HashMap to store word frequencies
        Map<String, Integer> wordFreqMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split line into words
                String[] words = line.split("\\s+");

                // Count frequency of each word
                for (String word : words) {
                    // Remove punctuation marks (if any)
                    word = word.replaceAll("[^a-zA-Z]", "");

                    // Convert to lowercase to ignore case sensitivity
                    word = word.toLowerCase();

                    // Update word frequency map
                    if (!word.isEmpty()) {
                        wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Print word frequencies
            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

