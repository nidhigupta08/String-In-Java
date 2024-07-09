package program;

public class append {

    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("The quick brown fox ");

        sentence.append("jumps over the lazy dog.");

        System.out.println("Original sentence: " + sentence);

        sentence.append(" Another sentence appended.");

        System.out.println("Sentence after appending: " + sentence);
    }
}