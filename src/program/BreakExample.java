package program;

public class BreakExample {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent job!");
                break;
            case 'B':
                System.out.println("Good work!");
                break;
            case 'C':
                System.out.println("Average performance.");
                break;
            case 'D':
            case 'F':
                System.out.println("Needs improvement.");
                break; // No need for separate break for D and F
            default:
                System.out.println("Invalid grade.");
        }
    }
}