package program;
public class Substring {

	public static void main(String[] args) {
		
	 
		 String str = "Hello, World!";

	        // Extracting substring from index 7 to the end of the string
	        String substr1 = str.substring(7);
	        System.out.println("Substring 1: " + substr1);

	        // Extracting substring from index 0 to index 5 (excluding index 5)
	        String substr2 = str.substring(0, 5);
	        System.out.println("Substring 2: " + substr2);

	        // Extracting substring from index 7 to index 12 (excluding index 12)
	        String substr3 = str.substring(7, 12);
	        System.out.println("Substring 3: " + substr3);
	    }

}
