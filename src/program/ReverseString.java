package program;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder reversed = new StringBuilder();
        reversed.append(str);
        reversed = reversed.reverse();
        System.out.println("Reversed string: " + reversed);
    }
}
