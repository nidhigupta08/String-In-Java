package program;

import java.util.regex.*;

class RegexExample6 {
    public static void main(String[] args) {
        String text = "Today is July 15, 2024. It's a beautiful day!";

        // Match dates in format YYYY-MM-DD
        String regex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";
        Matcher matcher = Pattern.compile(regex).matcher(text);

        if (matcher.find()) {
            System.out.println("Found a valid date: " + matcher.group());
        } else {
            System.out.println("No valid dates found in the text.");
        }
    }
}