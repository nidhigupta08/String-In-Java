package program;

public class BreakWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 7) {
                break;  // Terminate the loop when i is 7
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Loop terminated");
    }
}