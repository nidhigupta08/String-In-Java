package program;
import java.util.Scanner;

public class CheckNumber {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        checkNumber(number);
	    }
	    
	    public static void checkNumber(int num) {
	        if (num > 0) {
	            System.out.println("The number is positive.");
	        } else if (num < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	    }
}
