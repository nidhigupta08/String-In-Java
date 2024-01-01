package program;

public class JavaSmallProgram {
	public static void main(String[] args) {
        int tableSize = 10; // Define the size of the multiplication table
        
        // Nested loop to generate the multiplication table
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                System.out.print(i * j + "\t"); // Print the product of i and j
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
