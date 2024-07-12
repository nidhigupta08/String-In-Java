package program;

public class StringIsEmptyExample {

    public static void main(String[] args) {
        String emptyString = "";
        String nonEmptyString = "This is a string with content.";

        // Check if strings are empty using isEmpty()
        System.out.println("isEmpty(emptyString): " + emptyString.isEmpty());
        System.out.println("isEmpty(nonEmptyString): " + nonEmptyString.isEmpty());
    }
}