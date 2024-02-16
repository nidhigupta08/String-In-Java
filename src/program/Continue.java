package program;

public class Continue {
	 public static void main(String[] args) {
	        System.out.println("Example of continue statement:");
	        for (int j = 1; j <= 5; j++) {
	            if (j == 3) {
	                continue; // Skip the rest of the loop body when j equals 3
	            }
	            System.out.println("j: " + j);
	        }
	    }
}
