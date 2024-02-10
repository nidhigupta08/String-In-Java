package program;

import java.util.*;

public class UniqueValues {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9 };

        Set<Integer> uniqueValues = new HashSet<>();

        for (int num : array) {
            uniqueValues.add(num);
        }

        System.out.println("Unique values in the array:");
        for (int uniqueValue : uniqueValues) {
            System.out.print(uniqueValue + " ");
        }
    }
}
