package program;

public class CenterElementPrinter {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

	        if (numbers.length % 2 == 0) {
	            // If the array length is even
	            int center1 = numbers[numbers.length / 2 - 1];
	            int center2 = numbers[numbers.length / 2];
	            System.out.println("Center elements: " + center1 + ", " + center2);
	        } else {
	            // If the array length is odd
	            int center = numbers[numbers.length / 2];
	            System.out.println("Center element: " + center);
	        }
	    }
}
