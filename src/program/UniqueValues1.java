package program;

public class UniqueValues1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9 };

        System.out.println("Unique values in the array:");

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
