package program;

import java.util.HashSet;

public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
                found = true;
            } else {
                set.add(arr[i]);
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found in the array.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 10, 4};

        findDuplicates(arr);
    }
}
