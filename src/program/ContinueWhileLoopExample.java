package program;

public class ContinueWhileLoopExample {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 10) {
            number = (int) (Math.random() * 20) - 10;  // Generate random number between -10 and 9
            if (number < 0) {
                continue;  // Skip negative numbers
            }
            System.out.println(number);
        }
    }
}