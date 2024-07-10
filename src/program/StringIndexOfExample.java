package program;

public class StringIndexOfExample {

    public static void main(String[] args) {
        String sentence = "This is a string with multiple words.";

        // Find the first occurrence of the character 's'
        int firstSIndex = sentence.indexOf('s');
        System.out.println("Index of the first 's': " + firstSIndex);

        // Find the first occurrence of the substring "ring"
        int ringIndex = sentence.indexOf("ring");
        System.out.println("Index of the first 'ring': " + ringIndex);

        // Find the first occurrence of a non-existent substring
        int notFoundIndex = sentence.indexOf("apple");
        System.out.println("Index of 'apple' (not found): " + notFoundIndex);
    }
}
