package program;

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        // Sample array to be sorted
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

