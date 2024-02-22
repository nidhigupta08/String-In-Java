package program;

import java.util.Arrays;

public class StringArraySorting{
    public static void main(String[] args) {
        // Define an array of strings
        String[] names = {"John", "Alice", "Bob", "Charlie", "David"};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(names));

        // Sort the array using Arrays.sort() method
        Arrays.sort(names);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(names));
    }
}
