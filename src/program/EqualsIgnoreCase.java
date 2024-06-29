package program;

public class EqualsIgnoreCase {
	 public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "hello";
	        boolean isEqual = str1.equalsIgnoreCase(str2);
	        System.out.println("Strings are equal ignoring case: " + isEqual);
	    }
}
