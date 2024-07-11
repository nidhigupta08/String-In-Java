package program;

public class Intern  {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello"); // Creates a new String object with same content

        // Intern the strings and check for reference equality (may not be true in all Java versions)
        String internedStr1 = str1.intern();
        String internedStr2 = str2.intern();
        String internedStr3 = str3.intern();

        System.out.println("str1 == internedStr1: " + (str1 == internedStr1)); // May be true
        System.out.println("str2 == internedStr2: " + (str2 == internedStr2)); // May be true (same content as str1)
        System.out.println("str3 == internedStr3: " + (str3 == internedStr3)); // Likely false (different object)
        System.out.println("internedStr1 == internedStr2: " + (internedStr1 == internedStr2)); // May be true (same content)

        // Check for string equality using equals() (always reliable)
        System.out.println("str1.equals(internedStr2): " + str1.equals(internedStr2)); // True
        System.out.println("str3.equals(internedStr1): " + str3.equals(internedStr1)); // True
    }
}