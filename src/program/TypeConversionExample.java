package program;

public class TypeConversionExample {
	 public static void main(String[] args) {
	        int intValue = 10;
	        double doubleValue = 5.5;
	        
	        // Implicit type conversion (widening conversion)
	        doubleValue = intValue; // int to double
	        
	        System.out.println("Implicit conversion - int to double: " + doubleValue);
	        
	        // Explicit type conversion (narrowing conversion)
	        int newIntValue = (int) doubleValue; // double to int
	        
	        System.out.println("Explicit conversion - double to int: " + newIntValue);
	    }
}
