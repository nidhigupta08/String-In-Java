package program;

import java.util.Arrays;

public class ThirdLargestNumber {
    public static int findThirdLargest(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Check if the array length is less than 3
        if (arr.length < 3) {
            System.out.println("Array length is less than 3");
            return -1;
        }

        // Return the third largest number from the end
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        int[] arr = {1, 99, 4, 6, 10, 100, 101, 5, 77, 66};
        int thirdLargest = findThirdLargest(arr);
        
        if (thirdLargest != -1) {
            System.out.println("Third largest number in the array: " + thirdLargest);
        }
    }
}
