package program;

import java.util.Arrays;
import java.util.Random;

public class ParallelSorting {
    public static void main(String[] args) {
        // Generate an array of random integers
        int[] numbers = generateRandomArray(10_000_000);

        // Print the first 10 elements of the original array
        System.out.println("Original array (first 10 elements): " + Arrays.toString(Arrays.copyOfRange(numbers, 0, 10)));

        // Sort the array using Arrays.parallelSort() method
        long startTime = System.currentTimeMillis();
        Arrays.parallelSort(numbers);
        long endTime = System.currentTimeMillis();

        // Print the first 10 elements of the sorted array
        System.out.println("Sorted array (first 10 elements): " + Arrays.toString(Arrays.copyOfRange(numbers, 0, 10)));

        // Print the time taken for sorting
        System.out.println("Time taken for parallel sorting: " + (endTime - startTime) + " milliseconds");
    }

    // Method to generate an array of random integers
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000); // Generate random integers between 0 and 999
        }
        return arr;
    }
}
