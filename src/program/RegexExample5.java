package program;

import java.util.regex.*;

class RegexExample5 {
    public static void main(String[] args) {
        String text = "This is a sample string with phone numbers (123) 456-7890 and (987) 654-3210";

        // Match phone numbers with optional separators
        String regex = "\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.println("Phone number found: " + matcher.group());
        }
    }
}