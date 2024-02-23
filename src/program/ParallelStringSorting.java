package program;

import java.util.Arrays;

public class ParallelStringSorting {
    public static void main(String[] args) {
        // Define an array of strings
        String[] words = {"banana", "apple", "grape", "orange", "pear"};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(words));

        // Sort the array using Arrays.parallelSort() method
        Arrays.parallelSort(words);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(words));
    }
}
