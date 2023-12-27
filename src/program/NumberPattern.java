package program;

public class NumberPattern {
	public static void main(String[] args) {
        int rows = 5; // Define the number of rows in the pattern
        
        // Nested loop to generate the number pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
