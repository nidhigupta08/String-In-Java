package program;
import java.util.Arrays;
public class ArraySorting {
	
	    public static void main(String[] args) {
	        // Define an array of integers
	        int[] numbers = {5, 2, 9, 1, 7};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array using Arrays.sort() method
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
	}
