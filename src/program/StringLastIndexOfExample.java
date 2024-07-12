package program;

public class StringLastIndexOfExample {

    public static void main(String[] args) {
        String sentence = "This is a string with multiple occurrences of the letter 's'.";

        // Find the last occurrence of the character 's'
        int lastSIndex = sentence.lastIndexOf('s');
        System.out.println("Index of the last 's': " + lastSIndex);

        // Find the last occurrence of the substring "ing"
        int ingIndex = sentence.lastIndexOf("ing");
        System.out.println("Index of the last 'ing': " + ingIndex);

        // Find the last occurrence of a non-existent substring
        int notFoundIndex = sentence.lastIndexOf("apple");
        System.out.println("Index of 'apple' (not found): " + notFoundIndex);
    }
}