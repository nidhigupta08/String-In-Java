package program;

public class ContinueDoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1;
        do {
            if (count % 2 == 0) {
                count++;
                continue;  // Skip even numbers
            }
            System.out.println(count);
            count++;
        } while (count <= 10);
    }
}