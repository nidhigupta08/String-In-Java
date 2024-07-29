package program;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // Define an array of integers
        int[] array = {5, 2, 8, 4, 1, 3, 7, 6};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

