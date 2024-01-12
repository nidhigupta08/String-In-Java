package program;

public class BreakDoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;  // Terminate the loop when i is 4
            }
        } while (i <= 10);
        System.out.println("Loop terminated");
    }
}