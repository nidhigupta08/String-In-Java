package program;

public class ReverseSentence {
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
        return reversedSentence.toString().trim();
    }
    
    public static void main(String[] args) {
        String inputSentence = "my name is Pratima";
        String outputSentence = reverseSentence(inputSentence);
        
        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + outputSentence);
    }
}

