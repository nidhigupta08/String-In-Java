package program;

public class ReverseWordsInSentence {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        
        return reversedSentence.toString().trim();
    }
    
    public static void main(String[] args) {
        String inputSentence = "my name is Pratima";
        String outputSentence = reverseWords(inputSentence);
        
        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + outputSentence);
    }
}
