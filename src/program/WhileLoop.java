package program;

public class WhileLoop {
	 public static void main(String[] args) {
	        int count = 1;

	        // Print numbers from 1 to 5 using a while loop
	        System.out.println("Numbers from 1 to 5 using while loop:");
	        while (count <= 5) {
	            System.out.println(count);
	            count++;
	        }

	        // Calculate the sum of numbers from 1 to 10 using a while loop
	        int sum = 0;
	        count = 1; // Reset count for reuse
	        while (count <= 10) {
	            sum += count;
	            count++;
	        }
	        System.out.println("Sum of numbers from 1 to 10: " + sum);
	    }
}
