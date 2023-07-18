package stringbasic;

public class MethodOfString {

	public static void main(String[] args) {
		String s=" Nidhi is girl";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
//trim() method: eliminates white spaces before and after the String.
		System.out.println(s.trim());
// startsWith() and endsWith() method
		System.out.println(s.startsWith(" "));
		System.out.println(s.startsWith("Ni"));
		System.out.println(s.startsWith("rl"));
//charAt() Method: returns a character at specified index.
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(3));
//length() Method: returns length of the specified String.
		System.out.println(s.length());
//valueOf() Method
		
		
	}

}
