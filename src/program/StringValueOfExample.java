package program;

public class StringValueOfExample {

    public static void main(String[] args) {
        int number = 123;
        double decimalNumber = 3.14159;
        char character = 'A';
        boolean flag = true;

        // Convert primitive data types to String objects
        String numberString = String.valueOf(number);
        String decimalString = String.valueOf(decimalNumber);
        String charString = String.valueOf(character);
        String booleanString = String.valueOf(flag);

        System.out.println("Integer: " + number + " (String: " + numberString + ")");
        System.out.println("Double: " + decimalNumber + " (String: " + decimalString + ")");
        System.out.println("Character: " + character + " (String: " + charString + ")");
        System.out.println("Boolean: " + flag + " (String: " + booleanString + ")");
    }
}