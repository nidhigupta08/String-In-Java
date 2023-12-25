package program;

public class Casting {
	 public static void main(String[] args) {
	        // Implicit casting (Widening Conversion)
	        int myInt = 10;
	        double myDouble = myInt; // Implicit casting from int to double
	        System.out.println("Implicit Casting (Widening Conversion):");
	        System.out.println("Integer value: " + myInt);
	        System.out.println("Double value after implicit casting: " + myDouble);

	        // Explicit casting (Narrowing Conversion)
	        double anotherDouble = 15.75;
	        int anotherInt = (int) anotherDouble; // Explicit casting from double to int
	        System.out.println("\nExplicit Casting (Narrowing Conversion):");
	        System.out.println("Double value: " + anotherDouble);
	        System.out.println("Integer value after explicit casting: " + anotherInt);
	    }
}
