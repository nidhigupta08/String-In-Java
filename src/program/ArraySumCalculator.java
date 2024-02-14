package program;

public class ArraySumCalculator {
	 public static void main(String[] args) {

	        int[] numbers = {1, 2, 3, 4, 5};

	        int sum = 0;

	        for (int i = 0; i < numbers.length; i++) {

	            sum += numbers[i];

	            if (i % 2 == 0) {
	                continue;
	            }

	            for (int j = 0; j < numbers.length; j++) {
	                sum += numbers[j];
	                if (j % 2 != 0) {
	                    break;
	                }
	            }
	        }
	        System.out.println("Sum: " + sum);
	    }
}
