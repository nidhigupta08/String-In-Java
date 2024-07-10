package program;

public class StringTrimExample {

    public static void main(String[] args) {
        String originalString = "   Hello, World!   ";
        
        System.out.println("Original String (with leading/trailing spaces): " + originalString);
        System.out.println("Length of original String: " + originalString.length());
        
        String trimmedString = originalString.trim();
        
        System.out.println("\nTrimmed String: " + trimmedString);
        System.out.println("Length of trimmed String: " + trimmedString.length());
    }
}