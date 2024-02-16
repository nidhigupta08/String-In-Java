package program;

public class BreakExample1 {
	public static void main(String[] args) {
        System.out.println("Example of break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i equals 3
            }
            System.out.println("i: " + i);
        }
    }
}
